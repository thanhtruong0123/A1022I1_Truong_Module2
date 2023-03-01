package no12_search_algorithm.binary_search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at index " + i);
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter the value to find in array");
        int value = sc.nextInt();
        binarySearch(arr, 0, arr.length -1, value);
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {

        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                return binarySearch(arr,middle + 1, right, value);
            } else {
                return binarySearch(arr,middle + 1, middle - 1, value);
            }
        }
        return -1;
    }
}
