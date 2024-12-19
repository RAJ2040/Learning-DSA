package org.flowOfProgram;

import java.util.Scanner;
//Take 2 numbers as inputs and find their HCF and LCM.
public class LcmAndHcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = in.nextInt();

//        Formula for LCM and HCF(Euclidean Algorithm)

//        HCF(Euclidean Algorithm)
//        1. divide the num1 with num2 you get a remainder
//        2. divide num2 by remainder and keep on repeating the step till the remainder is 0

//        LCM
//        1. multiply both numbers num1 and num2
//        2. divide their product by HCF

        int hcf = findHcf(num1, num2);
        int lcm = (num1 * num2) / hcf;

        System.out.println("Hcf for given number is : " + hcf);
        System.out.println("Lcm for given number is : " + lcm);
    }
    public static int findHcf(int n1, int n2) {
        while (n2 != 0) {
            int rem = n2;
            n2 = n1 % n2;
            n1 = rem;
        }
        return n1;
    }
}
