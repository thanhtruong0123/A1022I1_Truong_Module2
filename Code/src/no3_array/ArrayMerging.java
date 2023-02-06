package no3_Array;

import java.util.Scanner;

public class Array_Merging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng 1");
        int length1 = sc.nextInt();
        int[] arr1 = new int[length1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập giá trị mảng tại vị trí " + i);
            arr1[i] = sc.nextInt();
        }

        System.out.println("Nhập chiều dài mảng 2");
        int length2 = sc.nextInt();
        int[] arr2 = new int[length2];

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập giá trị mảng tại vị trí " + i);
            arr2[i] = sc.nextInt();
        }

        int length3 = length1 + length2;
        int[] arr3 = new int[length3];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[i+length1] = arr2[i];
        }

        System.out.println("Mảng 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("");

        System.out.println("Mảng 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("");

        System.out.println("Mảng 3:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
