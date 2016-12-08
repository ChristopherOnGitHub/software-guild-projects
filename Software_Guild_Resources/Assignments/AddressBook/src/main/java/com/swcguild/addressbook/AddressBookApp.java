/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook;

import com.swcguild.addressbook.ops.AddressBookController;

/**
 *
 * @author ahill
 */
public class AddressBookApp {
    public static void main(String[] args) {
        AddressBookController addressBook = new AddressBookController();
        addressBook.run();
    }
}
