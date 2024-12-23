package org.firstJava;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = in.nextInt();

        if(num1>num2){
            System.out.println("Largest Number is :"+num1);
        }else System.out.println("Largest Number is :"+num2);
    }
}
