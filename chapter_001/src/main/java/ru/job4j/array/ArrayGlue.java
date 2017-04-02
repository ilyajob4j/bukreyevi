/**
package info.
*/
package ru.job4j.array;
/**
class info. Concatenate and sort two Arrays.
*/
public class ArrayGlue {
  /**
  method info. —оздать метод, принимающий на вход два отсортированных массива типа int.
  "—клеить" два массива в один, причем сделать это не просто добавлением второго массива в конец первого
  Ќа выходе должен получитьс€ сортированный массив. ѕример, два массива {1,2,3,6} и {1,3,4}, должно получитьс€
  {1,1,2,3,3,4,6}.
  @return glueed sorted array
  @param a = first array
  @param b = first array
  */
  int[] glueArrays(int[] a, int[] b) {
        int pointer = 0;
        int bigArray = 0;
        int smallArray = 0;

        if (a.length > b.length) {
            bigArray = a.length;
            smallArray = b.length;
        } else {
            bigArray = b.length;
            smallArray = a.length;
        }
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < smallArray; i++) {
            if (a[i] > b[i]) {
                result[pointer] = b[i];
                result[pointer + 1] = a[i];
                pointer += 2;
            }
            if (a[i] < b[i] || a[i] == b[i]) {
                result[pointer] = a[i];
                result[pointer + 1] = b[i];
                pointer += 2;
            }
        }
        for (int j = smallArray; j < bigArray; j++) {
            result[pointer] = a[j];
            pointer++;
        }
        return result;
    }
}
