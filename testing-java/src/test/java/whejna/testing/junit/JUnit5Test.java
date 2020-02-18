package whejna.testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import whejna.testing.HelloWorld;

public class JUnit5Test {
    @Test
    public void justASimpleTest() {
        assertEquals(0, 0, "it should be 0");
    }

    @Test
    public void testAnotherHelloWorldClass() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("JAMES", helloWorld.sayHelloUpper("James"));
    }
}