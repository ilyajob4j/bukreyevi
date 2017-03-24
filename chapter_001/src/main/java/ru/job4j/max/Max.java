/**
Maximum of two numbers.
*/
package ru.job4j.max;
/**
Class Max provides method, that returns maximum of two numbers.
@since 22/03/2017
@version 1.0
@author Bukreyev Ilya
*/
class Max {
  /**
  method max return one number which is greather than another.
  @param first number
  @param second number
  @return biggest one
  */
  public int max(int first, int second) {
    return first > second ? first : second;
  }
  /**
  @param first number
  @param second number
  @param third number
  @return max of numbers
  */
  public int max(int first, int second, int third) {
    int temp = max(first, second);
    return max(temp, third);
  }
}
