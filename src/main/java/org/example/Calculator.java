package org.example;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    //my factorial function
    public static long factorial(int n){
        logger.info("[FACTORIAL] - " + n);
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static double square_root(int n){
        double result;
        logger.info("[SQ ROOT] - " + n);

        result = Math.sqrt(n);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }

    public static double natural_log(int n){
        logger.info("[NATURAL LOG] - " + n);
        double result=0;
        try {
            if (n < 0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            if (n == 0){
                result = Double.NEGATIVE_INFINITY;
            }
            else {
                result = Math.log(n);
            }
        } catch (ArithmeticException error) {
            logger.error("[EXCEPTION - LOG] - Cannot find log of negative numbers");
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

    public static double x_power_b(int x, int b){
        logger.info("[POWER of" + x + "RAISED TO]" + b);
        double res;
        res = Math.pow(x, b);
        logger.info("[RESULT - POWER] - " + res);
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

                default: System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? \n 1.Yes 2.No");
            ex=sc.nextInt();
        }while(ex==1);
    }

}

