/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDSorting;

import java.util.Scanner;

public class PokeTrader
{   
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY"};

		int x;
                String y;

		do
		{
			System.out.println("EXCHANGE POKEMON\n");
			System.out.println("0. " + pokeParty[0]);
			for ( int i=1; i<pokeParty.length; i++ )
				System.out.println("\t" + i + ". " + pokeParty[i]);

			System.out.println("\nChoose a Pokemon to exchange with " + pokeParty[0] + ". (Or enter 0 to quit.)");
			System.out.print("> ");
			x = keyboard.nextInt();
                        y = pokeParty[0];
                        pokeParty[0]=pokeParty[x];
                        pokeParty[x]=y;

			

		} while ( x > 0 );

	}



}
