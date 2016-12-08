/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemos;

/**
 *
 * @author apprentice
 */
public class JavaDemo {
    
    public static void main(String[] args) {
        
        //Variable declarations
        
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        // Assign valules to a variable
        
        result = 0; // result is now zero
        operand1 = 11;
        operand2 = 7;
        operand3 = operand2;
        
        // Do math
        
        operand3 = (operand3 + 5);
        operand1 ++;
        result = operand1 + operand2 + operand3;
        
        System.out.println(operand1);
        ++operand1;
        System.out.println("This is operand1 now: " + operand1);
        System.out.println("This is ++operand1: " + ++operand1);
        System.out.println("This is operand1 NOW: " + operand1);
        System.out.println("This is operand1++ :" + operand1++);
        System.out.println("This is operand1 NOW: " + operand1);
        
        System.out.println("This is the current result: " + result);
        System.out.println(result - operand1);
        System.out.println("^^^This is the result minus operand1");
        
        //Multiplication
        
        System.out.println(operand1 + " = operand1");
        System.out.println(operand3 + " = operand3");
        System.out.println("operand1 * operand3 = " + (operand1*operand3) );
        
        //Division
        
        operand1 = 5;
        operand2 = 4;
        System.out.println("operand1 / operand2 = " + operand1/operand2 );
        System.out.println("4.0/5.0= " + 4.0/5.0 + "  These are not assigned as integers!!!");
        System.out.println("4/5= " + 4/5 + "  These are automatically integers");
        
        
        
        
        
    }
    
}
