package org.firstJava;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class InrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Amount in Rupees : ");
        int amount = in.nextInt();
        System.out.print("Enter Current Conversion rate of USD : ");
        double cRate = in.nextDouble();

        double cAmt = amount*cRate;

        System.out.println("The converted Amount from Rupees to USD is : "+cAmt+" $");
    }
}
