import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testCircle {

    private double delta = 0.0001;
    Circle first = new Circle (2,4,5);

    @Test
    public void square() {
        assertEquals(78.539816339744825, first.square(),delta);
    }

    @Test
    public void perimeter() {
        assertEquals(31.41592653589793, first.perimeter(),delta);
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
        assertEquals(10, first.getX(),delta);
        assertEquals(11, first.getY(),delta);
    }

    @Test
    public void smallestRectangle () {
        Rectangle uno = first.boundingBox (first);
        assertEquals(2, uno.getX(),delta);
        assertEquals(4, uno.getY(),delta);
        assertEquals(10, uno.getWidth(),delta);
        assertEquals(10, uno.getHeight(),delta);
    }
}
