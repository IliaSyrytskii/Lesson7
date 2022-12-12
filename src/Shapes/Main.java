package Shapes;

import Shapes.Circle;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Triangle tr = new Triangle(4, 6, 2);
        Rectangle re = new Rectangle(3, 5);
        Circle ci = new Circle(0,0,5);

        int[] array = new int[] {tr.getPerimeter(), re.getPerimeter(), ci.getPerimeter()};
        int sum = 0;
        System.out.println(Arrays.toString(array));
        for (int t = 0; t < array.length; t++ ) {
            sum += array[t];
        }
        System.out.println("Summ of perimeters = " + sum);
    }

}
