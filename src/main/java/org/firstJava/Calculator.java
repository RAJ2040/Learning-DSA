package org.firstJava;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value.(Use if conditions)
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = in.nextInt();
        System.out.print("Enter Operator : ");
        String op = in.next();

        if(op.equals("x")){
            System.out.println(num1*num2);
        } else if(op.equals("/")){
            System.out.println(num1/num2);
        } else if (op.equals("+")) {
            System.out.println(num1+num2);
        } else if (op.equals("-")) {
            System.out.println(num1-num2);
        }else System.out.println("Entered Operator is incorect");
    }
}
