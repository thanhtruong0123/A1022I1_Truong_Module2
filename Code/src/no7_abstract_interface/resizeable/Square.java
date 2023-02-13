package no7_abstract_interface.resizeable;

public class Square extends Shape implements IResizeable {
    private double length;

    public Square() {
    }

    public Square(String color, Boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    public Square(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = length*length;
        return area;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void resize(double percent) {
        this.length = length + (length* percent)/100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Chieu Dai: " + length +
                "; Dien tich: " + getArea() +
                '}';
    }
}
