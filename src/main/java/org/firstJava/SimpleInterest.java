package org.firstJava;

import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int principal = in.nextInt();
        System.out.print("Enter Time Duration(In Years) : ");
        int time = in.nextInt();
        System.out.print("Enter Rate Of Interest(In Percentage Per Annum) : ");
        int rate = in.nextInt();

        int simpleIntesest = (principal*time*rate)/100;

        System.out.println("Simple Interst of given data is :"+simpleIntesest);
    }
}
