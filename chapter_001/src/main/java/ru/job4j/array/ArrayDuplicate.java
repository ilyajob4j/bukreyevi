/**
package ArrayDuplicareRemover.
*/
package ru.job4j.array;

import java.util.Arrays;
/**
class ArrayDuplicareRemover.
*/
public class ArrayDuplicate {
  /**
  string duplicates remover.
  @param array string
  @return cleared string array
  */
  String[] remove(String[] array) {
        int j = array.length - 1;
        for (int i = 0; i <= j; i++) {
            for (int p = 0; p < i; p++) {
                if (array[i].equals(array[p])) {
                    array[i] = array[j];
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, j + 1);
    }
}
