/**
package.
*/
package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
PaintTest class.
*/
public class PaintTest {
  /**
  test height 2.
  */
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^\n^^^\n", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
    /**
    test height 3.
    */
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
      Paint paint = new Paint();
      String result = paint.piramid(3);
      String expected = String.format("  ^\n ^^^\n^^^^^\n", System.getProperty("line.separator"));
      assertThat(result, is(expected));
    }
}
