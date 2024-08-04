import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import telran.shapes.Canvas;
import telran.shapes.Rectangle;
import telran.shapes.Square;

public class ShapesTest {

    @Test
    void RectangleTest() {
        Rectangle rectangle = new Rectangle(8, 2);
        assertEquals(20, rectangle.perimeter());
        assertEquals(16, rectangle.square());
    }

    @Test
    void SquareTest() {
        Square square = new Square(5);
        assertEquals(20, square.perimeter());
        assertEquals(25, square.square());
    }

    @Test
    void CanvasTest() {
        Canvas canvas = new Canvas();
        Rectangle rectangle = new Rectangle(8, 2);
        Square square = new Square(5);
        canvas.addShape(rectangle);
        canvas.addShape(square);
        assertEquals(40, canvas.perimeter());
        assertEquals(41, canvas.square());

    }

    @Test
    void countTest() {
        //TODO
        // test of the method count of the class Canvas
        Rectangle rectangle = new Rectangle(8, 2);
        Square square1 = new Square(5);
        Square square2 = new Square(5);
        Square square3 = new Square(5);
        Canvas canvas = new Canvas();
        Canvas canvas1 = new Canvas();
        canvas.addShape(square1);
        canvas.addShape(square2);
        canvas1.addShape(rectangle);
        canvas1.addShape(square3);
        canvas1.addShape(canvas);
        assertEquals(5, canvas1.count());

        Rectangle rectangle1 = new Rectangle(8, 2);
        Square square4 = new Square(5);
        Square square5 = new Square(5);
        Canvas canvas2 = new Canvas();
        canvas2.addShape(rectangle1);
        canvas2.addShape(square4);
        canvas2.addShape(square5);
        canvas.addShape(canvas2);
        assertEquals(9, canvas1.count());

    }

}
