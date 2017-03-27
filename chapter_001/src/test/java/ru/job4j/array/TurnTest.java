/**
test package.
*/
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
class test TurnArray.
*/
public class TurnTest {
  /**
  even array sort testing.
  */
  @Test
  public void evenArraySort() {
    Turn obj = new Turn();
    int[] result = obj.back(new int[] {5, 4, 3, 2, 1});
    int[] expected =  {1, 2, 3, 4, 5};
    assertThat(result, is(expected));
  }
  /**
  odd array sort testing.
  */
  @Test
  public void oddArraySort() {
    Turn obj = new Turn();
    int[] result = obj.back(new int[] {4, 1, 6, 2});
    int[] expected =  {2, 6, 1, 4};
    assertThat(result, is(expected));
  }
}
