package org.flowOfProgram;
// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class SumInputTillX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;

        while (true){
            System.out.print("Enter a number to add or Press 'x' to get total : ");
            String x = in.next();
            if(x.equals("x")){
                break;
            }
            int num = Integer.parseInt(x);
            sum +=num;
        };
        System.out.println("the sum of total numbers you have entered is : "+sum);
    }
}
