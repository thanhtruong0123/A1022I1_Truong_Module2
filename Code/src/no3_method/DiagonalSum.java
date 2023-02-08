package no3_method;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng");
        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhập giá trị của mảng tại hàng " + i + ", cột " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        int diagonalSum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    diagonalSum += arr[i][j];
                }
            }
        }

        System.out.println("Tong gia tri tai duong cheo chinh la: " + diagonalSum);
    }
}
