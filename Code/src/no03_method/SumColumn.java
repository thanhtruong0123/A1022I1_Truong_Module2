package no03_method;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang");
        int row = sc.nextInt();

        System.out.println("Nhap so cot cua mang");
        int column = sc.nextInt();

        double[][] arr = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhap gia tri cua mang tai hang " + i + ", cot " + j);
                arr[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Nhap so cot ban muon tinh tong");
        int columnToSum = sc.nextInt();

        int sumColumn = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j == columnToSum) {
                    sumColumn += arr[i][j];
                }
            }
        }

        System.out.println("Tong cac gia tri tai cot " + columnToSum + ": " + sumColumn);
    }
}
