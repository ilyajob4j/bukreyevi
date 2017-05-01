/**
   package info.
 */
package ru.job4j.strategy;
/**
   class info.
 */
public class Paint {
/**
   String s for testing.
 */
private String s;
/**
   @param shape shape.
 */
public void draw(Shape shape) {
        s = shape.pic();
        System.out.println(s);
}
/**
   getter s.
   @return field s
 */
public String getS() {
        return this.s;
}
}
