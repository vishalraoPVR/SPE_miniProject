package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double square_root(int a) {
        logger.info("In square_root function!!");
        return Math.sqrt(a);
    }

    public static int factorial(int a) {
        logger.info("In factorial function!!");
        int res = a;
        for(int i=a-1;i>=1;i--) {
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opt=1;

        while(opt!=3) {
            logger.info("Taking input from user");
            System.out.println("Enter a choice: \n1. Square Root\n2. Factorial\n3. Exit");
            opt = sc.nextInt();
            int a,b;
            switch (opt) {
                case 1:
                    System.out.println("Enter a number to perform square root:");
                    a = sc.nextInt();
                    logger.info("CASE 1");
                    System.out.println("Square root of "+a+" is: " + square_root(a));
                    break;
                case 2:
                    System.out.println("Enter a number to perform factorial:");
                    a = sc.nextInt();
                    logger.info("CASE 2");
                    System.out.println("The factorial of " +a+" is: " + factorial(a));
                    break;
            }
        }
    }
}