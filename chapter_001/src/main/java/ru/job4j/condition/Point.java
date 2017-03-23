/**
package Point.
*/
package ru.job4j.condition;

/**
Point class.
@since 23/03/2017
@author Bukreyev Ilya
*/
class Point {
  /**
  @param x - first coordinate of Point
  */
  private int x;
  /**
  @param y - second coordinate of Point
  */
  private int y;
  /**
  @param x - first coordinate of Point (constructor)
  @param y - second coordinate of Point (constructor)
  */
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  /**
  getterX.
  @return field x
  */
  public int getX() {
    return this.x;
  }
  /**
  getterY.
  @return field y
  */
  public int getY() {
    return this.y;
  }
/**
returns does the Point belongs to function.
@param a - defined function's argument
@param b - defined function's argument
@return boolean: does the Point belongs to function
*/
  public boolean is(int a, int b) {
    return this.y == a * this.x + b;
  }
}
