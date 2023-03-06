package no14_exception.homework;

import java.util.Scanner;

public class TriangleApp {
    public static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Độ dài cạnh tam giác phải dương");
        } else if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng 2 cạnh tam giác phải lớn hơn cạnh còn lại");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh thứ nhất:");
        int side1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập độ dài cạnh thứ hai:");
        int side2 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập độ dài cạnh thứ ba:");
        int side3 = Integer.parseInt(sc.nextLine());

        try {
            checkTriangle(side1, side2, side3);
            System.out.println("Các cạnh hợp lệ");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
