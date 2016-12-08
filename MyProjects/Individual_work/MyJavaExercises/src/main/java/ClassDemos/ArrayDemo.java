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
public class ArrayDemo {

    public static void main(String[] args) {

        int[] teamScores = {
            2, 45, 4, 8, 99, 23, 67, 1, 88, 42
        };

        for (int i = 0; i < teamScores.length; i++) {
            System.out.println("Element =" + teamScores[i]);
        }

        for (int num : teamScores) {
            System.out.println("Element =" + num);
        }
    }
}
