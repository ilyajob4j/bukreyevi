/**
Triangle package.
*/
package ru.job4j.condition;
/**
Triangle class.
*/
public class Triangle {
  /**
  @param a first point with two coorditates
  */
  private Point a;
  /**
  @param b second point with two coorditates
  */
  private Point b;
  /**
  @param c third point with two coorditates
  */
  private Point c;
/**
constructor.
@param a point
@param b point
@param c point
*/
Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  /**
  @return Triangle S or exception if points leads on line.
  */
  public double area() {
    if (((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX()
     - c.getX()) * (a.getY() - c.getY())) == 0) {
    return -1;
    } else {
    return (((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX()
    - c.getX()) * (a.getY() - c.getY())) / 2);
    }
  }
}
