/**
   package info.
 */
package ru.job4j.strategy;
/**
   class info.
 */
public class Triangle implements Shape {
@Override
/**
   @return "image".
 */
public String pic() {
        StringBuilder result = new StringBuilder();
        return result.append("  *   \n").append(" *** \n").append("*****").toString();
}
}
