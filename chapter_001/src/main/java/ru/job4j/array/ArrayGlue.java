/**
package info.
*/
package ru.job4j.array;
/**
class info. Concatenate and sort two Arrays.
*/
public class ArrayGlue {
  /**
  method info. Создать метод, принимающий на вход два отсортированных массива типа int.
  "Склеить" два массива в один, причем сделать это не просто добавлением второго массива в конец первого
  На выходе должен получиться сортированный массив. Пример, два массива {1,2,5} и {2,3,4,6}, должно получиться
  {1,2,2,3,4,5,6}.
  @return glueed sorted array
  @param a = first array
  @param b = first array
  */
  int[] glueArrays(int[] a, int[] b) {
        int counterA = 0;
        int counterB = 0;
        int[] newArray = new int[a.length + b.length];

        for (int i = 0; i < newArray.length; i++) {
          if (counterA < a.length && counterB < b.length) {
            if (a[counterA] > b[counterB]) {
            newArray[i] = b[counterB];
            counterB++;
          } else {
            newArray[i] = a[counterA];
            counterA++;
          }
        } else if (counterA < a.length) {
          newArray[i] = a[counterA];
          counterA++;
        } else {
          newArray[i] = b[counterB];
          counterB++;
        }
      }
      return newArray;
    }
}
