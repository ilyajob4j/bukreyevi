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
    int[] result = obj.glueArrays(new int[] {1, 2, 5}, new int[] {2, 3, 4, 6});
    int[] expected = {1, 2, 2, 3, 4, 5, 6};
    assertThat(result, is(expected));
  }
}
