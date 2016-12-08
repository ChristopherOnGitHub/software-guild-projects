/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vendingmachinewebapp.dao;

import com.tsguild.vendingmachinewebapp.dto.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class VendingDaoImpl implements VendingDao {
    
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public void setJdbcTemplate (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    //Create an item
    
    private static final String SQL_ADD_ITEM =
            " INSERT INTO `itemTable` (name, price, stock) "
            + " VALUES(?, ?, ?)";
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
    public Item addItem(Item newItem){
        jdbcTemplate.update(SQL_ADD_ITEM,
                newItem.getName(),
                newItem.getPrice(),
                newItem.getStock()
        );
        int id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        newItem.setId(id);
        return newItem;
    }
    
    //Retrieve an item
    
    private static final String SQL_GET_ITEM =
            " SELECT * FROM `itemTable` WHERE `id` = ? ";
    
    @Override
    public Item getItemById(int id){
        try{
            return jdbcTemplate.queryForObject(SQL_GET_ITEM, new ItemMapper(), id);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }
    
    //Update an item
    
    private static final String SQL_UPDATE_ITEM = "UPDATE `itemTable` SET "
            + " `name` = ?, "
            + " `price` = ?, "
            + " `stock` = ? "
            + " WHERE `id` = ?";
    
    @Override
    public void updateItem(Item item){
        jdbcTemplate.update(SQL_UPDATE_ITEM,
                item.getName(),
                item.getPrice(),
                item.getStock(),
                item.getId()
                );
    }
    
    //Update an item by id
    
    private static final String SQL_UPDATE_ID = "UPDATE `itemTable` SET "
            + " `name` = ?, "
            + " `price` = ?, "
            + " `stock` = ? "
            + " WHERE `id` = ?";
    
    private static final String SQL_GET_ITEM_TO_UPDATE = " SELECT * FROM `itemTable` WHERE `id` = ? ";
    
    @Override
    public void stockMinusOne(int id){
        Item x;
        try{
            x = jdbcTemplate.queryForObject(SQL_GET_ITEM_TO_UPDATE, new ItemMapper(), id);
            
                jdbcTemplate.update(SQL_UPDATE_ID,
                x.getName(),
                x.getPrice(),
                x.getStock()-1,
                x.getId());
        }catch (EmptyResultDataAccessException e){}
    }
    
    // Delete an item
    
    private static final String SQL_REMOVE_ITEM = "DELETE FROM itemTable WHERE id = ?";
    
    @Override
    public void removeMovie(int id){
        jdbcTemplate.update(SQL_REMOVE_ITEM, id);
    }
    
    //Get all items
    
    private static final String SQL_GET_ALL_ITEMS =
            " SELECT * FROM itemTable ";
    
    @Override
    public List<Item> getAllItems(){
        List<Item> allItems;
        allItems = jdbcTemplate.query(SQL_GET_ALL_ITEMS, new ItemMapper());
        return allItems;
    }
    
    //Record Mapping
    
    private static final class ItemMapper implements RowMapper<Item> {
        
        @Override
        public Item
        mapRow(ResultSet rs, int rowNum)
                throws SQLException{
            Item mappedItem = new Item();
            Integer id = rs.getInt("id");
            String name = rs.getString("name");
            Double price = rs.getDouble("price");
            Integer stock = rs.getInt("stock");
            
            mappedItem.setId(id);
            mappedItem.setName(name);
            mappedItem.setPrice(price);
            mappedItem.setStock(stock);
            
            return mappedItem;
        }
    }
    
    
    
    
    
}
