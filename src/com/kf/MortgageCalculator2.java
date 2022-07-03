package com.kf;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator2 {
  public static void main(String[] args) {
    int principal = (int) getNumber("Please input Principle: ", 10_000, 1_000_000);
    float annualInterestRate = (float) getNumber("Please input annual mortgage rate: ", 0.01, 100);
    int numberOfYears = (int) getNumber("Please input mortgage years: ", 1, 30);

    // calculate mortgage
    double monthlyPayment = calculateMonthlyPayment(principal, annualInterestRate, numberOfYears);
    System.out.print(
        "Your monthly payment is: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
  }

  public static double calculateMonthlyPayment(
      int principal, double annualInterestRate, int numberOfYears) {

    final int MONTHS_PER_YEAR = 12; // no need to use int
    final float TO_PERCENTAGE = 0.01F;

    float monthlyInterestRate = (float) (annualInterestRate / MONTHS_PER_YEAR) * TO_PERCENTAGE;
    int numberOfTerms = numberOfYears * MONTHS_PER_YEAR;

    return principal
        * monthlyInterestRate * Math.pow(1 + annualInterestRate, numberOfTerms)
        / (Math.pow(1 + annualInterestRate, numberOfTerms) - 1);
  }

  public static double getNumber(String prompt, double lowLimit, double highLimit) {
    Scanner scanner = new Scanner(System.in);
    double value;
    while (true) {
      System.out.println(prompt);
      value = scanner.nextDouble();
      if (value >= lowLimit && value <= highLimit) break;
      System.out.println(
          "Invalid input! please input a value between " + lowLimit + " and " + highLimit);
    }
    return value;
  }
}
