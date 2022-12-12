package Shapes;

public abstract class Shape {
    public int x;
    public int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;

    }
    abstract int getPerimeter();
    abstract int getSquare();

}
