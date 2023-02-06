package no5_Access_Modifier.Access_Modifier;

public class Circle {
    public static final double PI = 3.14;
    private static double radius = 1.0;
    private static String color = new String("red");
    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Circle.color = color;
    }

    public static double getArea() {
        double area = PI * radius * radius;
        return area;
    }

    public static void setArea() {
        double area = PI * radius * radius;
    }
}
