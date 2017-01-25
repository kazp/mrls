import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testCircle {

    Circle first = new Circle (2,4,5);

    @Test
    public void square() {
        assertEquals(78.5, first.square(),0.0001);
    }
    @Test
    public void perimeter() {
        assertEquals(31.4, first.perimeter(),0.0001);
    }
    @Test
    public void isInside () {
        assertEquals(true, first.isInside(3,5));
    }
    @Test
    public void isNotInside () {
        assertEquals(false, first.isInside(8,5));
    }
    @Test
    public void move () {
        first.move(10,11);
        assertEquals(10, first.x1,0.0001);
        assertEquals(11, first.y1,0.0001);
    }
    @Test
    public void smallestRectangle () {
        Rectangle uno = first.boundingBox (first);
        assertEquals(2, uno.x1,0.0001);
        assertEquals(4, uno.y1,0.0001);
        assertEquals(10, uno.width,0.0001);
        assertEquals(10, uno.height,0.0001);
    }
}
