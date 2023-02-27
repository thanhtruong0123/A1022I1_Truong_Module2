package no07_abstract_interface.colorable;

public class Rectangle extends Shape implements IColorable {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(boolean filled, String color, double length, double width) {
        super(filled, color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                ", area: " + getArea() +
                ", color: " + getColor() +
                '}';
    }
}
