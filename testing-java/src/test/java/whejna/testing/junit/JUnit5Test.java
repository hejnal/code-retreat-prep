package whejna.testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import whejna.testing.Point;


public class JUnit5Test {
    @Test
    public void justASimpleTest() {
        Point p = new Point(0, 0);

        assertEquals(p.getX(), 0);
        assertEquals(p.getY(), 0);
        assertEquals(0, 0, "it should be 0");
    }

//    @Test
//    public void testAnotherHelloWorldClass() {
//        HelloWorld helloWorld = new HelloWorld();
//        assertEquals("JAMES", helloWorld.sayHelloUpper("James"));
//    }
}