package Shapes;

import Shapes.Shape;

public class Circle extends Shape {
    int r;
    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    int getPerimeter() {
        return (int) (2 * Math.PI * r);
    }

    @Override
    int getSquare() {
        return (int) (Math.PI * Math.sqrt(r));
    }

}
