package no7_abstract_interface.colorable;

import java.util.Scanner;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(true, "red", 2.1);
        shapes[1] = new Rectangle(true, "blue", 2.0, 3.2);

        for (Shape shape: shapes) {
            System.out.println(shape);
            if (shape instanceof IColorable) {
                ((IColorable) shape).howToColor();
            }
        }
    }
}
