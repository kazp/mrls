import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor on 2/7/2017.
 */


public class testSquare {

    private double delta = 0.0001;
    Square third = new Square (4,6,7);

    @Test
    public void square() {
        assertEquals(49, third.square(),delta);
    }
    @Test
    public void perimeter() {
        assertEquals(28, third.perimeter(),delta);
    }
    @Test
    public void isInside () {
        assertEquals(true, third.isInside(5,3));
    }
    @Test
    public void isNotInside () {
        assertEquals(false, third.isInside(3,5));
    }
    @Test
    public void move () {
        third.move(10,11);
        assertEquals(10, third.getX(),delta);
        assertEquals(11, third.getY(),delta);
    }
}

