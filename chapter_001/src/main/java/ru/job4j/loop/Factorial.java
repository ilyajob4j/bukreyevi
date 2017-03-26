/**
package loop.
*/
package ru.job4j.loop;
/**
class Factorial.
*/
public class Factorial {
  /**
  @param n - for Factorial
  @return factorial of a non-negative integer n, denoted by n!,
  is the product of all positive integers less than or equal to n.
  */
  public int calc(int n) {
    int factResult = 1;
        for (int i = 1; i <= n; i++) {
            factResult *= i;
        }
      return factResult;
    }
}
