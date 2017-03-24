/**
TriangleTest package.
*/
package ru.job4j.condition;
/**
TriangleTest.
*/
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
/**
TriangleTest class.
*/
public class TriangleTest {
/**
checks first condition.
*/
  @Test
  public void triangleSreturnPositive() {
    Triangle obj = new Triangle(new Point(3, 4), new Point(5, 6), new Point(1, 8));
    double result = obj.area();
    double expected = 6;
    assertThat(result, closeTo(expected, 0.01));
  }
  /**
  checks second condition.
  */
  @Test
  public void triangleSreturnNegative() {
    Triangle obj = new Triangle(new Point(1, 8), new Point(-2, -7), new Point(-4, -17));
    double result = obj.area();
    double expected = -1;
    assertThat(result, closeTo(expected, 0.01));
  }
}
