/**
package array.
*/
package ru.job4j.array;
/**
class turn array.
*/
public class Turn {
  /**
  @param array - sequence of ints
  @return sorted sequence
  */
  int[] back(int[] array) {
        int storage;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            storage = array[i];
            array[i] = array[j];
            array[j] = storage;
        }
        return array;
    }
}
