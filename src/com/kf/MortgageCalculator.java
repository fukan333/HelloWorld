package com.kf;

import java.lang.management.MonitorInfo;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        // use constant to make code more readable
        final int MONTHS_PER_YEAR = 12;     // no need to use int
        final float TO_PERCENTAGE = 0.01F;

        // create scanner for input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input Principle: ");
        int principal = Integer.parseInt(scanner.next());

        System.out.print("Please input mortgage rate: ");
        double annualInterestRate = Double.parseDouble(scanner.next()) / MONTHS_PER_YEAR * TO_PERCENTAGE;

        System.out.print("Please input mortgage years: ");
        int numberOfTerms = Integer.parseInt(scanner.next()) * MONTHS_PER_YEAR;

        //
        double res = principal * annualInterestRate * Math.pow(1 + annualInterestRate, numberOfTerms) /
                    (Math.pow(1 + annualInterestRate, numberOfTerms) - 1);

        String MonthlyPayment = NumberFormat.getCurrencyInstance().format(res);
        System.out.print("Your monthly payment is: " + MonthlyPayment);
    }
}