package no04_class;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double root1;
    private double root2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return delta = Math.pow(b, 2) - 4*a*c;
    }

    public double getRoot1() {
        return root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }

    public double getRoot2() {
        return root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a");
        double a = sc.nextDouble();

        System.out.println("Nhap b");
        double b = sc.nextDouble();

        System.out.println("Nhap c");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double delta = quadraticEquation.getDelta();

        if (delta > 0) {
            double root1 = quadraticEquation.getRoot1();
            double root2 = quadraticEquation.getRoot2();
            System.out.println("Nghiem phuong trinh x1: " + root1 + ", x2: " + root2);
        } else if (delta == 0) {
            double root = quadraticEquation.getRoot1();
            System.out.println("Phuong trinh co mot nghiem x1: " + root);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
