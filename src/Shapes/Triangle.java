package Shapes;

import Shapes.Shape;

public class Triangle extends Shape {

    int h;

    public Triangle(int x, int y, int h) { //взял равнобедренный
        super(x, y);
        this.h = h;
    }
    @Override
    public int getPerimeter(){
        return 2*x + y;
    }

    @Override
    int getSquare() {
        return (y * h) / 2;
    }

}
