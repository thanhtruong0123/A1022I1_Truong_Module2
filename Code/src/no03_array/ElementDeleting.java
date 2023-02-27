package no03_array;

import java.util.Scanner;

public class ElementDeleting {
    static int index;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài Mảng");
        int length = sc.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị mảng tại vị trí " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhập phần tử cần xóa");
        int deleteNum = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] == deleteNum) {
                index = i;
                count++;
            }
            if (count < 1) {
                System.out.println("Phần tử này không có trong Mảng");
            }
        }

        System.out.println("Mảng cũ: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[length-1] = 0;

        System.out.println("");
        System.out.println("Mảng mới: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
