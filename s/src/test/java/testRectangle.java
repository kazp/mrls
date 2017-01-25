import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testRectangle {

    Rectangle second = new Rectangle (2,4,5,6);

    @Test
    public void square() {
        assertEquals(30, second.square(),0.0001);
    }
    @Test
    public void perimeter() {
        assertEquals(22, second.perimeter(),0.0001);
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
        assertEquals(10, second.x1,0.0001);
        assertEquals(11, second.y1,0.0001);
    }
}





