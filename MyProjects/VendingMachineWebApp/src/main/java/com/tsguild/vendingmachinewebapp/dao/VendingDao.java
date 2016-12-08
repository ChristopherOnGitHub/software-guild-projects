/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vendingmachinewebapp.dao;

import com.tsguild.vendingmachinewebapp.dto.Item;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public interface VendingDao {

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    Item addItem(Item newItem);

    List<Item> getAllItems();

    Item getItemById(int id);

    void removeMovie(int id);

    void setJdbcTemplate(JdbcTemplate jdbcTemplate);

    void updateItem(Item item);
    
    void stockMinusOne(int id);
    
}
