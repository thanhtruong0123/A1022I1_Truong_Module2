package no1_Introduction.Homework;

import java.util.Scanner;

public class MoneyConverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Dollar");
        int inputUsd = sc.nextInt();
        int result = 23000/inputUsd;
        System.out.println(result + "VND");
    }
}
