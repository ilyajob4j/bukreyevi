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
  /**
  extended test for another method - 3 numbers #1.
  */
  @Test
  public void compareThreeNumbersReturnGreathest1() {
    Max obj = new Max();
    int result = obj.max(5, 9, 3);
    int expected = 9;
    assertThat(result, is(expected));
  }
  /**
  extended test for another method - 3 numbers #2.
  */
  @Test
  public void compareThreeNumbersReturnGreathest2() {
    Max obj = new Max();
    int result = obj.max(9, 5, 3);
    int expected = 9;
    assertThat(result, is(expected));
  }
  /**
  extended test for another method - 3 numbers #3.
  */
  @Test
  public void compareThreeNumbersReturnGreathest3() {
    Max obj = new Max();
    int result = obj.max(5, 3, 9);
    int expected = 9;
    assertThat(result, is(expected));
  }
}
