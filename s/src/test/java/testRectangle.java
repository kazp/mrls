import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testRectangle {

    private double delta = 0.0001;
    Rectangle second = new Rectangle (2,4,5,6);

    @Test
    public void square() {
        assertEquals(30, second.square(),delta);
    }
    @Test
    public void perimeter() {
        assertEquals(22, second.perimeter(),delta);
    }
    @Test
    public void isInside () {
        assertEquals(true, second.isInside(3,3));
    }
    @Test
    public void isNotInside () {
        assertEquals(false, second.isInside(9,5));
    }
    @Test
    public void move () {
        second.move(10,11);
        assertEquals(10, second.getX(),delta);
        assertEquals(11, second.getY(),delta);
    }
}





