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
    public int perimeter() {
        // sum of all included shape perimiters
        int sum = 0;

        for (int i = 0; i < shapes.length; i++) {
            sum = sum + shapes[i].perimeter();
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

    public int count() {
        // TODO
        // returns number of all shapes in a canvas object
        //example: canvas has one rectangle, one square, one canvas 
        //containing one two squares
        // for this example the method should return 5
        int count = 0;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Canvas) {
                Canvas cuCanvas = (Canvas)shapes[i];
                count = count + cuCanvas.count();    
            }
            count++;
        }

        return count;

    }

}
