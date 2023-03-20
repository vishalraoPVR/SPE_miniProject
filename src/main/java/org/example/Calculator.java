package org.example;
import java.util.Scanner;

public class Calculator {



    //my factorial function
    public static long factorial(int n) {

        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static double square_root(int n) {
        double result;


        result = Math.sqrt(n);

        return result;
    }

    public static double natural_log(int n) {

        double result = 0;
        try {
            if (n < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            if (n == 0) {
                result = Double.NEGATIVE_INFINITY;
            } else {
                result = Math.log(n);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        return result;
    }

    public static double x_power_b(int x, int b) {
        double res;
        res = Math.pow(x, b);
        return res;
    }


    public static void main(String [] args)
    {
        int num1,num2=0,option,ex;
        double res;
        long ress;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice from the following menu:");
            System.out.println("1.Square root \n2.Factorial \n3.Natural log \n4.power x^b \n5.Exit");
            System.out.println("Enter your choice : ");
            option = sc.nextInt();
            if(option==4){
                System.out.println("Enter the first number->x");
                num1=sc.nextInt();
                System.out.println("Enter the second number->b");
                num2=sc.nextInt();
            }
            else if(option!=5){
                System.out.println("Enter the number");
                num1=sc.nextInt();
            }
            else
                break;
            switch(option)
            {
                case 1:
                    res = square_root(num1);
                    System.out.println("Square root of "+num1+" is "+res);
                    break;
                case 2:
                    ress = factorial(num1);
                    System.out.println("Factorial of "+num1+" is "+ress);
                    break;
                case 3:
                    res = natural_log(num1);
                    System.out.println("Natural log (ln) of "+num1+" is "+res);
                    break;
                case 4:
                    res = x_power_b(num1, num2);
                    System.out.println(num1+" to the power "+num2+" is "+res);
                    break;
                case 5:
                    break;
                default: System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? \n 1.Yes 2.No");
            ex=sc.nextInt();
        }while(ex==1);
    }

}

