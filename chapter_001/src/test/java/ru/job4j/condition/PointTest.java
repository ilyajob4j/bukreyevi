/**
PointTest package.
*/
package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
PointTest class.
*/
public class PointTest {
  /**
  test method - happy flow. It sets "proper" object-point which exectly belongs
  to function with right arguments.
  */
  @Test
  public void setArgumentsOfFunctionAndSpecificPointHappyPath() {
    Point obj = new Point(5, 7);
    boolean result = obj.is(1, 2);
    boolean expected = true;
    assertThat(result, is(expected));
  }
  /**
  Sad flow, checks just the opposite.
  */
  @Test
  public void setArgumentsOfFunctionAndSpecificPointSadPath() {
    Point obj = new Point(5, 7);
    boolean result = obj.is(1, 3);
    boolean expected = false;
    assertThat(result, is(expected));
  }
}
