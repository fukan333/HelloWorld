package com.kf;

import java.security.KeyStore;

public class ControlFlow {
  public static void main(String[] args) {
    //  comparison operators: == != <= >= < >
    double a = Math.random();
    double b = Math.random();
    System.out.println(a < b);

    //  logical operators:  &&  ||  !
    boolean hasHighIncome = (Math.random() > 0.5);
    boolean hasGoodCredit = (Math.random() > 0.5);
    boolean hasCriminalRecord = (Math.random() > 0.5);
    boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    System.out.println(isEligible);

    // if statement
    double temp = Math.random() * 100;
    if (temp >= 80) {
      System.out.println("Hot Day!");
    } else if (temp >= 60) {
      System.out.println("Good Day!");
    } else {
      System.out.println("Cold Day!");
    }

    //  turn operator
    double income = Math.random() * 1_000_000;
    String level = income >= 750_000 ? "premium account" : "basic account";
    System.out.println(level);
    /* instead of:
    String level = "basic";
    if (income >= 750_000) { level = "premium"; }
     */

    //  switch
    String user = "admin";
    switch (user) {
      case "admin":
        System.out.println("You are an admin!");
        break;
      case "regularUser":
        System.out.println("You are a regular user!");
        break;
      default:
        System.out.println("Welcome Guest!");
    }
  }
}
