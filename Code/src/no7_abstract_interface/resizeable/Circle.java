package no7_abstract_interface.resizeable;

import java.util.Scanner;

public class Circle extends Shape implements Resizeable {
    private double radius;
    public Circle() {
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.pow(getRadius(), 2) * Math.PI;
        return area;
    }

    public void resize(double percent) {
        this.radius = radius + (radius* percent)/100;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Ban kinh: " + radius +
                "; Dien tich: " + getArea() +
                '}';
    }
}
