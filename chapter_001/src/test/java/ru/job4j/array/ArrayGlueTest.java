/**
test package.
*/
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
class test ArrayGlueTest.
*/
public class ArrayGlueTest {
  /**
  glueing and sorting.
  */
  @Test
  public void glueArraysAndSort() {
    ArrayGlue obj = new ArrayGlue();
    int[] result = obj.glueArrays(new int[] {1, 2, 3, 6}, new int[] {1, 3, 4});
    int[] expected = {1, 1, 2, 3, 3, 4, 6};
    assertThat(result, is(expected));
  }
}
