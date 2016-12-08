/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook.dao;

import com.swcguild.addressbook.model.Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ahill
 */
public class AddressBookDAOStub implements AddressBookDAO{

    private Address recentAddress = null;
    private Random r = new Random();
    
    @Override
    public void addAddress(Address address) {
        recentAddress = address;
    }

    @Override
    public Address removeAddress(String name) {
        recentAddress = r.nextBoolean() ? null : recentAddress;
        return r.nextBoolean() ? recentAddress : new Address("Doctor", "Who", "123 Blue Tardis Dr.", "Gallifrey", "WA", "45283");
    }

    @Override
    public int addressCount() {
        return r.nextInt(5);
    }

    @Override
    public List<Address> getAllAddresses() {
        ArrayList<Address> list = new ArrayList<>();
        if(r.nextBoolean()){list.add(new Address("Marie", "Curie", "123 South Science St.", "Schnitzelville", "MA", "33043"));}
        if(r.nextBoolean()){list.add(new Address("Quinoa", "Speltsburg", "333 Pumpkin Lane", "Llamaston", "TX", "12845"));}
        if(r.nextBoolean()){list.add(new Address("Levar", "Burton", "450 Over Rainbow Dr.", "Reading", "OH", "99874"));}
        return list;
    }

    @Override
    public Address getAddress(String name) {
        return r.nextBoolean()? recentAddress : new Address("Mayor", "Fifi", "123 Biscuit St.", "Woofsburg", "KY", "22667");
    }
    
}
