package org.firstJava;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String to check wether its Palindrome : ");
        String pal = in.next();
        StringBuilder sb = new StringBuilder();

        int num = pal.length();
        for(int i = num -1; i >= 0;i--){
            sb.append(pal.charAt(i));
        }
        String newPal = sb.toString();
        if(pal.equals(newPal)){
            System.out.println(pal+" is Palindrome");
        }else System.out.println(pal+" is not Palindrome");

    }
}
