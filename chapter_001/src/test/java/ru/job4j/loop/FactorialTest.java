/**
loop package.
*/
package ru.job4j.loop;
/**
FactorialTest.
*/
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
FactorialTest class.
*/
public class FactorialTest {
  /**
  test 0.
  */
  @Test
  public void factorialTestZero() {
    Factorial obj = new Factorial();
    int result = obj.calc(0);
    int expected = 1;
    assertThat(expected, is(result));
  }
  /**
  test number 5.
  */
  @Test
  public void factorialTestFive() {
    Factorial obj = new Factorial();
    int result = obj.calc(5);
    int expected = 120;
    assertThat(expected, is(result));
  }
}
