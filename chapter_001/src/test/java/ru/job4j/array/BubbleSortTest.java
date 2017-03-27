/**
test package.
*/
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
class test BubbleSort.
*/
public class BubbleSortTest {
  /**
  bubble testing hm.
  */
  @Test
  public void bubbleSortTest() {
    BubbleSort obj = new BubbleSort();
    int[] result = obj.sort(new int[] {5, 1, 2, 7, 3});
    int[] expected = {1, 2, 3, 5, 7};
    assertThat(expected, is(result));
  }
}
