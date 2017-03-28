/**
test package.
*/
package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
class test duplicates remover.
*/
public class ArrayDuplicateTest {
  /**
  test method.
  */
  public void removeDuplicatesString() {
    ArrayDuplicate obj = new ArrayDuplicate();
    String[] result = obj.remove(new String[]{"Привет", "Мир",
     "Привет", "Супер", "Мир"});
     String[] expected = {"Привет", "Мир", "Супер"};
     assertThat(result, is(expected));
  }
}
