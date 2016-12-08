/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapplication.dao;

import com.tsguild.petshelterwebapplication.dto.Pet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class PetShelterDaojdbcImpl implements PetShelterDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SQL_ADD_PET = "INSERT INTO Pets (name, disposition, breedId, vaccinated) "
            + " VALUES(?, ?, ?, ?)";

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Pet addPet(Pet pet) {
        jdbcTemplate.update(SQL_ADD_PET,
                pet.getName(),
                pet.getDisposition(),
                2,
                pet.isVacinated()
        );

        int id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        pet.setId(id);
        return pet;
    }

    private static final String SQL_SELECT_PET_BY_ID
            = "SELECT Pets.*, Breeds.breed FROM Pets "
            + " LEFT JOIN Breeds ON Pets.breedId = Breeds.id"
            + " WHERE Pets.id = ?";

    @Override
    public Pet getPetById(int petId) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_PET_BY_ID, new PetMapper(), petId);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    private static final String SQL_SELECT_ALL_PETS
            = "SELECT Pets.*, Breeds.breed FROM Pets LEFT JOIN Breeds ON Pets.breedId = Breeds.id";

    @Override
    public List<Pet> getAllPets() {
        List<Pet> allPets;
        allPets = jdbcTemplate.query(SQL_SELECT_ALL_PETS, new PetMapper());
        return allPets;
    }

    private static final String SQL_UPDATE_PET_BY_ID
            = "UPDATE Pets SET name = ?, "
            + " breedId = ?, "
            + " disposition = ?, "
            + " vaccinated = ? "
            + " WHERE Pets.id = ? ";

    @Override
    public void updatePet(Pet pet) {
        
        int breedId = 
        
        jdbcTemplate.update(SQL_UPDATE_PET_BY_ID,
//                pet.getName(),
//                breedId,
                pet.getDisposition(),
                pet.isVacinated(),
                pet.getId());
    }

    private static final String SQL_REMOVE_PET_BY_ID = "DELETE FROM Pets WHERE id = ?";

    @Override
    public void removePet(int petId) {
        jdbcTemplate.update(SQL_REMOVE_PET_BY_ID,
                petId);
    }

    private static final String SQL_BREEDID_BY_NAME = 
            "SELECT id FROM Breeds WHERE breed = ?";
    private static final String SQL_INSERT_BREED =
            "INSERT INTO Breeds (breed) VALUES(?)";
    
    @Transactional(propagation = Propagation.REQUIRED, readOnly = )
    private int getBreedIdByName(String breed){
        try{
        jdbcTemplate.queryForObject(SQL_BREEDID_BY_NAME, Integer.class);
        } catch (EmptyResultDataAccessException e){
            jdbcTemplate.update(SQL_INSERT_BREED, breed);
            id = jdbcTemplate.queryForObject("SELECT_INSERT_ID()", Integer.class);
        }
        return id;
    }
    
    @Override
    public List<Pet> searchPets(Map<SearchTerm, String> criteria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pet> searchPets(Predicate<Pet> filter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static final class PetMapper implements RowMapper<Pet> {

        @Override
        public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
            Pet mappedPet = new Pet();
            // id, name, disposition, breedId, vaccinated, breed
            String name = rs.getString("name");
            String disposition = rs.getString("disposition");
            String breed = rs.getString("breed");
            Boolean vacc = rs.getBoolean("vaccinated");
            Integer petId = rs.getInt("id");
            Integer breedId = rs.getInt("breedId");

            mappedPet.setId(petId);
            mappedPet.setName(name);
            mappedPet.setBreed(breed);
            mappedPet.setVacinated(vacc);
            mappedPet.setDisposition(disposition);

            return mappedPet;
        }

    }

}
