/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDWhileLoops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CountingWithAWhileLoop {
    
    	public static void main( String[] args )
	{
		Scanner userInput = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = userInput.nextLine();

		int n = 0;
		while ( n < 130 )
		{
			System.out.println( (n+10) + ". " + message );
			n=n+10;
		}

	}
}
    
