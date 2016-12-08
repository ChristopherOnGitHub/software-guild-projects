package LabsWeek1;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class InterestCalculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double interestRate;
        int timePeriod;
        int yearsUntilClose;
        int currentYear = 2016;
        double beginYearPrinciple;
        double endYearPrinciple;
        double periodRate = 0;
        double preLoopPrinciple = 0;
        double interestEarnedThisYear;
        double initialPrinciple;

        System.out.println("Hello! What is your starting principal?");
        System.out.println("Note: Enter negative number to calculate compounding debt.");
        beginYearPrinciple = userInput.nextDouble();

        System.out.println("How many years will this account be open?");
        yearsUntilClose = userInput.nextInt();
        while (yearsUntilClose <= 0) {
            System.out.println("Please enter a valid number");
            yearsUntilClose = userInput.nextInt();
        }

        System.out.println("Will interest be compounding: YEARLY(1) QUARTERLY(2) "
                + "MONTHLY(3) DAILY(4)");
        timePeriod = userInput.nextInt();
        while (timePeriod <= 0 || timePeriod > 4) {
            System.out.println("Will interest be compounding: YEARLY(1) QUARTERLY(2) "
                    + "MONTHLY(3) DAILY(4)");
            timePeriod = userInput.nextInt();
        }

        do {
            System.out.println("What is the yearly interest rate? (%)");
            interestRate = userInput.nextDouble();
        } while (interestRate <= 0);

        initialPrinciple = beginYearPrinciple;

        switch (timePeriod) {
            case 1:
                periodRate = 1 + (interestRate / 100);
                break;
            case 2:
                periodRate = 1 + ((interestRate / 4) / 100);
                break;
            case 3:
                periodRate = 1 + ((interestRate / 12) / 100);
                break;
            case 4:
                periodRate = 1 + ((interestRate / 365) / 100);
                break;
            default:
                System.out.println("ERROR! PLEASE CLOSE AND TRY AGAIN!");
        }

        while (yearsUntilClose > 0) {
            currentYear++;

            System.out.println("Current year: " + currentYear);
            yearsUntilClose--;

            System.out.println("Years until account close: " + yearsUntilClose);
            preLoopPrinciple = beginYearPrinciple;

            for (int i = timePeriod; i > 0; i--) {
                beginYearPrinciple = (beginYearPrinciple * periodRate);
            }

            interestEarnedThisYear = (beginYearPrinciple - preLoopPrinciple);
            System.out.println("You started the year with: $" + preLoopPrinciple);
            System.out.println("You ended the year with: $" + beginYearPrinciple);
            System.out.println("You earned: $" + interestEarnedThisYear + " in interest this year.");
            System.out.println("You have earned: $" + (beginYearPrinciple - initialPrinciple)
                    + " since opening the account.");
            System.out.println("");
            System.out.println(" ");
            System.out.println(" ");
        }

    }

}
