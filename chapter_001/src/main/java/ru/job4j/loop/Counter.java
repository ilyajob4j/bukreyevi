/**
package loop.
*/
package ru.job4j.loop;
/**
Counter.
*/
public class Counter {
/**
@param start - begin of range
@param finish - end of range
@return summ
*/
  public int add(int start, int finish) {
    int result = 0;
    for (int i = start; i <= finish; i++) {
      if (i % 2 == 0) {
        result = result + i;
      }
    }
    return result;
  }
}
