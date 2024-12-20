package org.flowOfProgram;

import java.util.Scanner;

//Take two numbers and print the sum of both.
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = in.nextInt();

        int sum = num1+num2;
        System.out.println("Sum of given number is : "+sum);

    }
}
