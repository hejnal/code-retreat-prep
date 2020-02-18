package whejna.testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import whejna.testing.Point;


public class PointTest {
    @Test
    public void justASimpleTest() {
        Point p = new Point(0, 0);

        assertEquals(p.getX(), 0);
        assertEquals(p.getY(), 0);
        assertEquals(0, 0, "it should be 0");
    }


}