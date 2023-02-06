package no3_Method;

import java.util.Scanner;

public class Min_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị mảng tại vị trí " + i);
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
