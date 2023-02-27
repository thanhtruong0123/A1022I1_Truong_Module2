package no07_abstract_interface.colorable;

public class Square extends Shape implements IColorable {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public Square(boolean filled, String color, double length) {
        super(filled, color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = length * length;
        return area;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square{" +
                ", area: " + getArea() +
                ", color: " + getColor() +
                '}';
    }
}
