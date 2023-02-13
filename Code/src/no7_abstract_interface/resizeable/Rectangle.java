package no7_abstract_interface.resizeable;

public class Rectangle extends Shape implements IResizeable {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(String color, Boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width) {
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

    public double getArea() {
        double area = length*width;
        return area;
    }

    public void resize(double percent) {
        this.length = length + (length * percent)/100;
        this.width = width + (width * percent)/100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Chieu Dai: " + length +
                ", Chieu rong: " + width +
                ", Dien tich: " + getArea() +
                '}';
    }
}
