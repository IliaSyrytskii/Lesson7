package Shapes;

import Shapes.Shape;

public class Rectangle extends Shape {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    int getPerimeter() {
        return 2 * (x + y);
    }

    @Override
    int getSquare() {
        return x * y;
    }

}
