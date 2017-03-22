/**
Max method test.
*/
package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
MaxTest for testing Max.java class.
*/
public class MaxTest {
  /**
  first part of test method, gets two arguments, first is greather than
  second, should return first of them.
  */
  @Test
  public void compareNumberOneAndTwoReturnOne() {
    Max obj = new Max();
    int result = obj.max(2, 1);
    int expected = 2;
    assertThat(result, is(expected));
  }
/**
second part of test method, gets two arguments, second is greather than
first, should return second of them.
*/
  @Test
  public void compareNumberOneAndTwoReturnTwo() {
    Max obj = new Max();
    int result = obj.max(5, 6);
    int expected = 6;
    assertThat(result, is(expected));
  }
}
