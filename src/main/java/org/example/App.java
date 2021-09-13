/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        // inputs 1-4 ask the user about their principal amount, rate, and years being passes and compounded
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        String inputPrincipal = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is the rate? ");
        String inputInterestRate = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.print("What is the number of years? ");
        int inputYears = Integer.parseInt(input3.nextLine());

        Scanner input4 = new Scanner(System.in);
        System.out.print("What is the number of times the interest is compounded per year? ");
        int inputCompounded = Integer.parseInt(input4.nextLine());

        // created double copies of the principal and interest rate so i could do the math and have the original
        // string that was inputted be put in the output
        double convertedPrincipal = Double.parseDouble(inputPrincipal);
        double covertedInterestRate = Double.parseDouble(inputInterestRate) / 100;

        double compoundInterest = convertedPrincipal * Math.pow((1 + (covertedInterestRate / inputCompounded)), (inputCompounded * inputYears));

        System.out.println(String.format("$%s invested at %s%% for %d years compounded at %d times per year is $%.2f.", inputPrincipal, inputInterestRate, inputYears, inputCompounded, compoundInterest));
    }
}
