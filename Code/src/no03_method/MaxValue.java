package no03_method;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr's row");
        int row = sc.nextInt();

        System.out.println("Enter the length of arr's column");
        int column = sc.nextInt();

        double[][] arr = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the value of array at row " + i + " column " + j);
                arr[i][j] = sc.nextDouble();
            }
        }

        double max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The max value is: " + max);
    }
}
