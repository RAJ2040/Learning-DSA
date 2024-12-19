package org.flowOfProgram;

//Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int num = in.nextInt();

        if(num%4 == 0){
            System.out.println(num+" : is a Leap Year");
        }
        else System.out.println(num+" : is not a Leap Year");
    }
}
