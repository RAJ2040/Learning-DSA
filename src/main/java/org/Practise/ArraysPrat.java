package org.Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrat {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int[] arr1 = {1, 2, 3, 4, 5};
//        arr[0] = 25;
//
//        System.out.println(Arrays.toString(arr) + "  " + Arrays.toString(arr1));
//        System.out.println(arr[0]);
//        for (int i : arr1) {
//            System.out.print(i);
//        }
//        Scanner in = new Scanner(System.in);

        //2D array

//        int[][] arr2d = new int[3][5];
//        for(int i =0;i<arr2d.length; i++){
//            for (int j=0; j < arr2d[i].length; j++){
//                arr2d[i][j] = in.nextInt();
//
//            }
//        }
//        for(int i =0;i<arr2d.length; i++){
//            for (int j=0; j < arr2d[i].length; j++){
////                System.out.println(Arrays.toString(arr2d));
//                System.out.print(arr2d[i][j]);
//            }
//            System.out.println();
//        }

//        ArrayList<Integer> arrlist = new ArrayList<>();
//        arrlist.add(20);
//        for (int i = 0; i < 20; i++) {
//            arrlist.add(i);
//        }
//        arrlist.set(10,50);
//        System.out.println(arrlist.remove(0));
//        System.out.println(arrlist);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i:arr) {
            System.out.print(i);
        }
        System.out.println();
        swap(arr,1,4 );
        for (int i:arr) {
            System.out.print(i);
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
            max = arr[i];
        }
        System.out.println();
        System.out.println(max);

        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println();
        for (int i:arr) {
            System.out.print(i);
        }

    }
//Swap function
    static void swap(int[] arr,int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;

    }
}
