package org.firstJava;

//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = in.nextInt();

        if(num == 0){
            System.out.println("nor even nor odd number");
        }
        else if(num%2 == 0){
            System.out.println(num +" - is a Even number");
        }
        else{
            System.out.println(num +" - is a Odd number");
        }
    }
}
