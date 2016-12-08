/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrays;

public class GivingAnArrayABunchOfValuesAtOnce
{
	public static void main( String[] args )
                
	{
		String[] arr1 = { "alpha", "bravo", "charlie", "dealta", "echo" };
                int[] numberArray = {11,12,13,44,56};

		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<arr1.length; i++ ){
			System.out.print( arr1[i] + " " );
                }
		System.out.println();
                
                for ( int x=0; x<numberArray.length; x++){
                    System.out.print(numberArray[x] + " ");
                }

	}
}