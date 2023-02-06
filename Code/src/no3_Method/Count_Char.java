package no3_Method;

import java.util.Scanner;

public class Count_Char {
    public static void main(String[] args) {
        String str = "Code Gym Da nang";
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap 1 ky tu de dem");
        char countChar = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (countChar == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua ky tu " + countChar + " la: " + count);
    }
}
