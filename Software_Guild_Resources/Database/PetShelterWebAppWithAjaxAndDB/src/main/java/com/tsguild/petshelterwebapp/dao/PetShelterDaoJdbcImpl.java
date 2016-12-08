/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.dao;

import com.tsguild.petshelterwebapp.dto.Pet;
import java.sql.ResultSet;
import java.sql.SQLException;
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
 * @author ahill
 */
public class PetShelterDaoJdbcImpl implements PetShelterDao{

    // So here's our private property to hold the jdbcTemplate obj
    private JdbcTemplate jdbcTemplate;
    
    // Here's a setter to do setter injection!!
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    private static final String SQL_ADD_PET =
            "INSERT INTO Pets (name, disposition, breedId, vaccinated) " +
            "	VALUES(?, ?, ?, ?)";
    
    @Override
    // Transactional means run ALL these commands as a BATCH!
    // AKA no one else is allowed to cut in line while you are doing YOUR job
    @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
    public Pet addPet(Pet pet) {
        // Talking to JDBC and doing an UPDATE
        // because we are CHANGING DATA on the MySQL Server
        // Without needing anything back from the resultset
        jdbcTemplate.update(SQL_ADD_PET, // first give the SQL
                    pet.getName(), // then get out the name, to substitute for the first ?
                    pet.getDisposition(), // then the disp, for the second ?
                    getBreedIdByName(pet.getBreed()),
                    pet.isVaccinated() // then the vacc prop for the last ?
                );
        
        // We've added the pet, now we want to know the ID
        // So we have to ask SQL for that
        
        // Query for object is when you have written a query statement
        // that should return only ONE thing. And you tell SQL what that thing is.
        int id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        pet.setId(id);
        return pet;
    }

    private static final String SQL_SELECT_PET_BY_ID =
            "SELECT Pets.*, Breeds.breed FROM Pets " +
            " LEFT JOIN Breeds ON Pets.breedId = Breeds.id " +
            " WHERE Pets.id = ?";
    @Override
    public Pet getPetById(int petId) {
        // I am using queryForObject here because I only expect ONE object back.
        // This is because I am selecting based on a contactId, which a primary key
        // which has a uniqueness constraint in the contact table!
        try{
        return jdbcTemplate.queryForObject(SQL_SELECT_PET_BY_ID, // select stmt
                new PetMapper(), // what we're turning the RS into!
                petId); // and then subsitituting in any placeholders
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    
    
    private static final String SQL_SELECT_ALL_PETS =
            "SELECT Pets.*, Breeds.breed FROM Pets LEFT JOIN Breeds ON Pets.breedId = Breeds.id";

    @Override
    public List<Pet> getAllPets() {
        List<Pet> allPets;
        allPets = jdbcTemplate.query(SQL_SELECT_ALL_PETS, new PetMapper());
        return allPets;
    }

    private static final String SQL_UPDATE_PET_BY_ID =
            "UPDATE Pets SET name = ?, " +
            " breedId = ?, disposition = ?, " +
            " vaccinated = ? WHERE Pets.id = ?";
    
    @Override
    public void updatePet(Pet pet) {
        int breedId = getBreedIdByName(pet.getBreed());
        
        jdbcTemplate.update(SQL_UPDATE_PET_BY_ID,
                pet.getName(),
                breedId,
                pet.getDisposition(),
                pet.isVaccinated(),
                pet.getId());
    }

    
    private static final String SQL_REMOVE_PET_BY_ID 
            = "DELETE FROM Pets WHERE id = ?";
    @Override
    public void removePet(int petId) {
        // update is for no returns
        jdbcTemplate.update(SQL_REMOVE_PET_BY_ID, // provide the SQL
                petId);
    }

    private static final String SQL_BREED_ID_BY_NAME =
            "SELECT id FROM Breeds WHERE breed = ?";
    private static final String SQL_INSERT_BREED =
            "INSERT INTO Breeds (breed) VALUES(?)";
    
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    private int getBreedIdByName(String breed){
        Integer id;
        try{
            id = jdbcTemplate.queryForObject(SQL_BREED_ID_BY_NAME, Integer.class, breed);
        } catch (EmptyResultDataAccessException e){
            jdbcTemplate.update(SQL_INSERT_BREED, breed);
            id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
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
    
    
    private static final class PetMapper implements RowMapper<Pet>{

        @Override
        public Pet mapRow(ResultSet rs, int rowNum) throws SQLException {
            Pet mappedPet = new Pet();
            // id, name, disposition, breedId, vaccinated, breed
            String name = rs.getString("name");
            String disposition = rs.getString("disposition");
            Boolean vacc = rs.getBoolean("vaccinated");
            String breed = rs.getString("breed");
            Integer petId = rs.getInt("id");
            Integer breedId = rs.getInt("breedId");
            
            mappedPet.setId(petId);
            mappedPet.setName(name);
            mappedPet.setBreed(breed);
            mappedPet.setVaccinated(vacc);
            mappedPet.setDisposition(disposition);
            
            return mappedPet;
        }
        
    }
}
