package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape {

    Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape) {
        shapes = Arrays.insert(shapes, shapes.length, shape);
    }

    @Override
    public int perimiter() {
        // sum of all included shape perimiters
        int sum = 0;

        for (int i = 0; i < shapes.length; i++) {
            sum = sum + shapes[i].perimiter();
        }

        return sum;
    }

    @Override
    public int square() {
        // sum of all included shape square
        int sum = 0;

        for (int i = 0; i < shapes.length; i++) {
            sum = sum + shapes[i].square();
        }

        return sum;
    }

}
