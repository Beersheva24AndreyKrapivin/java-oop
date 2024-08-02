import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import telran.shapes.Canvas;
import telran.shapes.Rectangle;
import telran.shapes.Square;

public class ShapesTest {

    @Test
    void RectangleTest() {
        Rectangle rectangle = new Rectangle(8, 2);
        assertEquals(20, rectangle.perimiter());
        assertEquals(16, rectangle.square());
    }

    @Test
    void SquareTest() {
        Square square = new Square(5);
        assertEquals(20, square.perimiter());
        assertEquals(25, square.square());
    }

    @Test
    void CanvasTest() {
        Canvas canvas = new Canvas();
        Rectangle rectangle = new Rectangle(8, 2);
        Square square = new Square(5);
        canvas.addShape(rectangle);
        canvas.addShape(square);
        assertEquals(40, canvas.perimiter());
        assertEquals(41, canvas.square());

    }

}
