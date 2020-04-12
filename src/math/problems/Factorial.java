package math.problems;

import java.util.Scanner;

/**
 * Created by Ariful on 04/10/20.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


           Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number:");

            int num = scanner.nextInt();
            int factorial = fact(num);
            System.out.println("Factorial of entered number is: "+factorial);
        }
        static int fact(int n)
        {
            int output;
            if(n==1){
                return 1;
            }

            output = fact(n-1)* n;
            return output;





    }
}
