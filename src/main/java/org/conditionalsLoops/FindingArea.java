package org.conditionalsLoops;

import java.util.Scanner;

public class FindingArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a numeric value to find area of specific" + '\n' +
                "1 : for Circle " +'\n'+
                "2 : for Triangle" +'\n'+
                "3 : for Rectangle3");
        int input = in.nextInt();

        switch (input) {
            case 1: {
                System.out.println("Enter radius of circle");
                int radius = in.nextInt();
                double area = areaOfCircle(radius);
                System.out.println("Area of Circle is = " + area);
                break;
            }
            case 2: {
                System.out.println("Enter base");
                int base = in.nextInt();
                System.out.println("Enter hight");
                int hight = in.nextInt();
                double area = areaOfTriangle(base, hight);
                System.out.println("Area of Triangle is = " + area);
                break;
            }
            case 3: {
                System.out.println("Enter base");
                int base = in.nextInt();
                System.out.println("Enter hight");
                int hight = in.nextInt();
                double area = areaOfRectangle(base, hight);
                System.out.println("Area of Rectangle is = " + area);
                break;
            }

        }

    }

    static double areaOfCircle(int r) {
        double a = 3.14 * r * 2;
        return a;
    }

    static double areaOfTriangle(int b, int h) {
        double a = (b * h) / 2;
        return a;
    }
    static double areaOfRectangle(int b, int h) {
        double a = b * h;
        return a;
    }
}
