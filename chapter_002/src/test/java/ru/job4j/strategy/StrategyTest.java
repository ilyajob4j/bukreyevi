/**
   package info.
 */
package ru.job4j.strategy;
/**
   class info.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
   test class.
 */
public class StrategyTest {
/**
   test triangleTest.
 */
@Test
public void triangleTest() {
        Paint paint = new Paint();
        Triangle triangle = new Triangle();
        paint.draw(triangle);
        assertEquals(paint.getS(), "  *   \n *** \n*****");
}
/**
   test Square.
 */
@Test
public void squareTest() {
        Paint paint = new Paint();
        Square square = new Square();
        paint.draw(square);
        assertEquals(paint.getS(), "####\n####\n####\n####");
}
}
