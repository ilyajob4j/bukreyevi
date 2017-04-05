/**
test package.
*/
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
class test TestStringContainsSubstring.
*/
public class TestStringContainsSubstring {
  /**
  test method1.
  */
  @Test
  public void testStringContainsSubstring1() {
    StringContainsSubstring obj = new StringContainsSubstring();
    boolean result = obj.isStringContainsSubstring("bbin", "bin");
    boolean expected = true;
    assertThat(result, is(expected));
  }
  /**
  test method2.
  */
  @Test
  public void testStringContainsSubstring2() {
    StringContainsSubstring obj = new StringContainsSubstring();
    boolean result = obj.isStringContainsSubstring("kabinebilozimi", "binn");
    boolean expected = false;
    assertThat(result, is(expected));
  }
  /**
  test method3.
  */
  @Test
  public void testStringContainsSubstring3() {
    StringContainsSubstring obj = new StringContainsSubstring();
    boolean result = obj.isStringContainsSubstring("delyvremyadelyw", "delyw");
    boolean expected = true;
    assertThat(result, is(expected));
  }
}
