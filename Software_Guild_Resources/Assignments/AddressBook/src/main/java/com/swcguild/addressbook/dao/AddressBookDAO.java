/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook.dao;

import com.swcguild.addressbook.model.Address;
import java.util.Collection;

/**
 *
 * @author ahill
 */
public interface AddressBookDAO {
    
//1. Allow the user to add addresses to the address book.
//2. Allow the user to remove addresses from the address book.
//3. Allow the user to see how many addresses are in the book.
//4. Allow the user to list all the addresses in the book.
//5. Allow the user to find an address by last name. 
    
    public void addAddress(Address address);
    public Address removeAddress(String name);
    public int addressCount();
    public Collection<Address> getAllAddresses();
    public Address getAddress(String name);
    
}
