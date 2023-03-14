package org.example;
import java.util.Scanner;
public class Calculator {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int sub(int a, int b) {
        return a-b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opt=1;

        while(opt!=3) {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter a choice: \n1. Addition\n2. Subtraction\n3. Exit");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("The result is: " + add(a, b));
                    break;
                case 2:
                    System.out.println("The result is: " + sub(a, b));
                    break;
            }
        }

    }
}
