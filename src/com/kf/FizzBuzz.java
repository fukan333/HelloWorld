package com.kf;

import java.util.Scanner;

/*
This is the code for practice switch
 */
public class FizzBuzz {
  public static void main(String[] args) {
    /*
    print Fizz if it can be divide by 5
    print Buzz if it can be divide by 3
    print FizzBuzz if it can be divide by both 5 and 3
     */
    System.out.print("Please input your age: ");
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();

    //  check the number
    if (age % 5 == 0 && age % 3 == 0) {
      System.out.println("FizzBuzz");
    } else if (age % 5 == 0) {
      System.out.println("Fizz");
    } else if (age % 3 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(age);
    }
  }
}
