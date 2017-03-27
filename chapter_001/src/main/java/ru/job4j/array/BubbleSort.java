/**
package bubble.
*/
package ru.job4j.array;
/**
class info.
*/
public class BubbleSort {
  /**
  @param array - sequence to be sorted
  @return sorted array
  */
  public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int tmp;
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
