/**
package info.
*/
package ru.job4j.array;
/**
Class info.
*/
public class RotateArray {
/**
method rigtht description.
@return turned +90 2D array.
@param array source
*/
public int[][] rotate(int[][] array) {
    int w = array.length;
    int h = array[0].length;
    int[][] ret = new int[h][w];
    for (int i = 0; i < h; ++i) {
        for (int j = 0; j < w; ++j) {
            ret[i][j] = array[w - j - 1][i];
        }
    }
    return ret;
  }
}
