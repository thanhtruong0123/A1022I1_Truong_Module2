package no3_Method;

import java.util.Scanner;

public class Max_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr's row");
        int row = sc.nextInt();

        double[][] arr = {{1.0, 2.0, 3.0}, {44.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}
