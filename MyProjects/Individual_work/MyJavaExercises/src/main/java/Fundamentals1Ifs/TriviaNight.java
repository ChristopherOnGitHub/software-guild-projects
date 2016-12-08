/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentals1Ifs;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TriviaNight {
    public static void main(String[] args) {
        
        Scanner answerStorage = new Scanner(System.in);
        
        int correctAnswers = 0;
        
        System.out.println("IT'S TIME FOR TRIVIA!");
        System.out.println(" ");
        System.out.println("Question 1: What number comes after 2?");
        System.out.println("1) 1        2) 2");
        System.out.println("3) 3        4) 4");
        int answer1 = answerStorage.nextInt();
        if(answer1 == 3){
            correctAnswers =(correctAnswers+1);
        }
        
        System.out.println("Question 2: What color is the sky?");
        System.out.println("1) Green    2) Blue ");
        System.out.println("3) Yellow   4) Red");
        int answer2 = answerStorage.nextInt();
        if(answer2 == 2){
            correctAnswers=(correctAnswers+1);
        }
        
        System.out.println("Final Question: What is the meaning of life and everything?");
        System.out.println("1) A very complex ideal  2) A horrible truth");
        System.out.println("3) It is without meaning 4) 42");
        int answer3 = answerStorage.nextInt();
        if (answer3==4){
            correctAnswers=(correctAnswers+1);
        }
        
        if(correctAnswers==0){
            System.out.println("You did not get answers correct, serisously???");
        }
        else if((correctAnswers==1) || (correctAnswers==2)){
            System.out.println("Not bad, are you sure you know what comes after 2?");
        }
        else if(correctAnswers == 3){
            System.out.println("You haved aced this test!");
        }
        else{
            System.out.println("If you see this, something has gone wrong.");
        }
    }
    
}
