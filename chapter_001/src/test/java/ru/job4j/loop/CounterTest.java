/**
CounterTest package.
*/
package ru.job4j.loop;
/**
CounterTest.
*/
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
CounterTest class.
*/
public class CounterTest {
  /**
  test summ.
  */
  @Test
  public void getSumOfEvenNums() {
    Counter obj = new Counter();
    int result = obj.add(1, 10);
    int expected = 30;
    assertThat(expected, is(result));
  }
}
