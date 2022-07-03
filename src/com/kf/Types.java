package com.kf;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Types {

    public static void main(String[] args) {
        /*
        Primitive Types (simple values)
        Type        Bytes       Range
        byte        1           [-128m 127]
        short       2           [-32k, 32k]
        int         4
        long        8
        float       4
        double      8
        char        2
        boolean     1           true / false
         */
        System.out.println("\n************ Primitive Types ************");
        byte myAge = 32;   // variable name use camel case
        long viewsCount = 3_123_456_789L;   // use L(preferred) or l to avoid integer number too large
        float price = 10.99F;   // java auto treat 10.99 as a double
        char letter = 'A';      // '' for single char, "" for string
        boolean isEligible = false;
        System.out.println("I am " + myAge + "now.");

        /*
        Reference Types (complex objects)
         */
        System.out.println("\n************ Reference Types ************");
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        // x, y is point to two separate addresses not a values
        Point p = new Point(1, 2);
        p.x = 2;
        System.out.println(p);

        System.out.println("\n************ String ************");
        // string
        String message = " Hello! \n\t\"Kan\"" + "!   ";
        System.out.println(message);
        System.out.println(message.charAt(1));
        System.out.println(message.trim());
        System.out.println();

        // Arrays (fixed length)
        System.out.println("\n************ Arrays ************");
        int[] numbers1 = new int[5];
        numbers1[0] = 1;
        numbers1[1] = 2;    // default values are 0, false, etc.
        int[] numbers2 = {2, 3, 1 ,5, 4};

        System.out.println(numbers1);   // will print the address
        System.out.println(Arrays.toString(numbers1) + '\n');  // use toString to print the elements

        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        // 2D
        int[][] grid = new int[3][3];
        grid[1][1] = 5;
        System.out.println(Arrays.toString(grid));
        System.out.println(Arrays.deepToString(grid));

        // 3D
        int[][][] cub = new int[2][2][2];
        cub[1][0][1] = 3;
        System.out.println(Arrays.deepToString(cub));

        System.out.println("\n************ Constant ************");
        // constant
        final float PI = 3.14F; // use final to make pi a constant, all capitalized

        // arithmetic expressions
        // priority () --> */ --> +-
        System.out.println("\n************ Arithmetic expressions ************");
        System.out.println("10 / 3 = " + 10 / 3);
        System.out.println("(double)10 / 3 = " + (double)10 / 3);
        int x = 1;
        System.out.println(x++);    // will print first then x plus 1 --> 1
        System.out.println(++x);    // will plus 1 first then print --> 3
        System.out.println(x += 3);

        //  Implicit casting (not lose information), compatible types
        //  byte > short > int > long > float > double
        short a = 1;
        double b = a + 1.1; // implicit get a double with same value of a then add to 1.1
        System.out.println(b);

        double c = 1.1;
        int d = (int) c + 2;  // explicit c to an integer then add 2 will output 3
        System.out.println(d);

        // wrapper class
        String e = "1";
        int f = Integer.parseInt(e)+ 1;
        System.out.println(f);

        System.out.println("\n************ Math class ************");
        // Math class
        System.out.println("round(1.1) = " + Math.round(1.1F));
        System.out.println("ceil(1.1) = " + (int) Math.ceil(1.1F));
        System.out.println("floor(1.1) = " + (int) Math.floor(1.1F));
        System.out.println("max(1, 2) = " + Math.max(1, 2));
        System.out.println("(int) (random() * 100) = " + (int) (Math.random() * 100));

        // format numbers
        System.out.println(NumberFormat.getCurrencyInstance().format(296_000.0F));
        System.out.println(NumberFormat.getPercentInstance().format(680.0 / 725.0));

        // until package
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name:  ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}