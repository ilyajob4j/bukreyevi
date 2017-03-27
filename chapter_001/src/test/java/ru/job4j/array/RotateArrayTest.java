/**
test package.
*/
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
class test RotateArray.
*/
public class RotateArrayTest {
  /**
  test right 3x3 array turning.
  */
  @Test
  public void right2Darray3x3Turn() {
    RotateArray obj = new RotateArray();
    int[][] result = obj.rotate(new int[][] {{0, 1, 2},
                                             {3, 4, 5},
                                             {6, 7, 8}});
    int[][] expected = {{6, 3, 0},
                        {7, 4, 1},
                        {8, 5, 2}};
    assertThat(result, is(expected));
  }
  /**
  test right 2x2 array turning.
  */
  @Test
  public void right2Darray2x2Turn() {
    RotateArray obj = new RotateArray();
    int[][] result = obj.rotate(new int[][] {{0, 1},
                                             {3, 4}});
    int[][] expected = {{3, 0},
                        {4, 1}};
    assertThat(result, is(expected));
  }
}
