/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrays;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Hangman {

    public static void main(String[] args) {

        Random randGen = new Random();
        Scanner userInput = new Scanner(System.in);

        char[] raisin = {'r', 'a', 'i', 's', 'i', 'n'};
        char[] thesis = {'t', 'h', 'e', 's', 'i', 's'};
        char[] height = {'h', 'e', 'i', 'g', 'h', 't'};
        char[] square = {'s', 'q', 'u', 'a', 'r', 'e'};
        char[] sheath = {'s', 'h', 'e', 'a', 't', 'h'};
        char[] coffee = {'c', 'o', 'f', 'f', 'e', 'e'};
        char[] guilty = {'g', 'u', 'i', 'l', 't', 'y'};
        char[] sniper = {'s', 'n', 'i', 'p', 'e', 'r'};
        char[] heroes = {'h', 'e', 'r', 'o', 'e', 's'};
        char[] sprout = {'s', 'p', 'r', 'o', 'u', 't'};
        char[] banana = {'b', 'a', 'n', 'a', 'n', 'a'};
        char[] shower = {'s', 'h', 'o', 'w', 'e', 'r'};

        char[] displayArray = {'?', '?', '?', '?', '?', '?'};

        char[] userArray = {};

        char[] guessedLetters = {'>', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        int wrongGuesses = 0;
        int x = 0;
        int y = 1;

        int randNum = randGen.nextInt(12);

        switch (randNum) {
            case 0:
                userArray = raisin;
                break;
            case 1:
                userArray = thesis;
                break;
            case 2:
                userArray = height;
                break;
            case 3:
                userArray = square;
                break;
            case 4:
                userArray = sheath;
                break;
            case 5:
                userArray = guilty;
                break;
            case 6:
                userArray = coffee;
                break;
            case 7:
                userArray = sniper;
                break;
            case 8:
                userArray = heroes;
                break;
            case 9:
                userArray = banana;
                break;
            case 10:
                userArray = shower;
                break;
            case 11:
                userArray = sprout;
                break;
        }

        while ((wrongGuesses < 6) && (('?'==(displayArray[0]) || ('?'==displayArray[1])
                || ('?'==displayArray[2])|| ('?'==displayArray[3])|| ('?'==displayArray[4])
                || ('?'==displayArray[5])))){
            System.out.println("GUESS A LETTER!");
            x = 0;
            for (int i = 0; i < displayArray.length; i++) {
                System.out.print(displayArray[i]);
            }
            System.out.println(" ");
            char userGuess = userInput.next().charAt(0);

            for (int i = 0; i < displayArray.length; i++) {
                if (userGuess == userArray[i]) {
                    displayArray[i] = userArray[i];
                } else {
                    x = x + 1;
                }
                if (x == 6) {
                    wrongGuesses = wrongGuesses + 1;
                }
            }
            guessedLetters[y] = userGuess;
            for (int i = 0; i < guessedLetters.length; i++) {
                System.out.print(guessedLetters[i]);
            }
            y++;
            System.out.println("# of incorrect guesses: " + wrongGuesses);
            System.out.println(" ");
        }
        
        if (wrongGuesses > 5) {
            System.out.println("YOU'RE OUT OF GUESSES");
        } else {
            System.out.println("CONGRATULATIONS!");
        }

    }

}
