package org.flowOfProgram;

import java.util.Scanner;

// Take a number as input and print the multiplication table for it.
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = in.nextInt();
        for(int i = 1; i<=10; i++){
            int value = num*i;
            System.out.println(num+"x"+i+"="+value);
        }
    }
}
