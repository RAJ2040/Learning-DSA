package org.firstJava;
// To calculate Fibonacci Series up to n numbers.

import org.flowOfProgram.Sum;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the Fibonacci till that number");
        int nTh = in.nextInt();

        int sum = 0;
        int num1 = 1;
        int num2 = 0;

        for(int i = 1; i <= nTh; i++){
            num2 = sum;
            sum = num1+num2;
            num1= num2;
            System.out.print(sum+", ");
        }
    }
}
