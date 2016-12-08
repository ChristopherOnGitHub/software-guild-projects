/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;

/**
 *
 * @author apprentice
 */
public class Table {
    public static void main(String[] args) {
        
        TableProvingGround grandOak = new TableProvingGround(4, true);
        TableProvingGround lameTable = new TableProvingGround(3, false);
        
        System.out.println(grandOak.isClearOfDebris);
        grandOak.messUpTable();
        System.out.println(grandOak.isClearOfDebris);
        //
        System.out.println(lameTable.isClearOfDebris);
        lameTable.cleanTable();
        System.out.println(lameTable.isClearOfDebris);
        //
        System.out.println("The lame table has "+lameTable.numberOfLegs+" legs and it is "+
                lameTable.isClearOfDebris+" that it is clean.");
        System.out.println("Let's ruin this table!");
        lameTable.sawOffLeg();
        System.out.println(lameTable.numberOfLegs+" legs of the table remain.");
        
               
    }
    
}
