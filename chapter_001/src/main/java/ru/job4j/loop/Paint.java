/**
package loop.
*/
package ru.job4j.loop;
/**
class Paint.
*/
public class Paint {
  /**
  method piramid.
  @param height - piramid heigth.
  @return string object.
  */
  public String piramid(int height) {
      StringBuilder line = new StringBuilder();
      int row;
      int temp;
      int c;
      temp = height;
        for (row = 1; row <= height; row++) {
            for (c = 1; c < temp; c++) {
                line.append(" ");
            }
            temp--;
            for (c = 1; c <= 2 * row - 1; c++) {
                line.append("^");
            }
            line.append("\n");
        }
        return line.toString();
      }
    }
