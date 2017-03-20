
/**
* Calculator
*/
package ru.job4j.calculator;

/**.
* Calculator, provides 4 arithmetics actions
* @author Bukreyev Ilya
* @version 1.0
* @since 20/03/2017
*/
class Calculator {

  /**.
  * @param result - stores the final result of the operation
  */
  private double result;

  /**.
  * getResult
  * @return result
  */
  double getResult() {
    return result;
  }

  /**.
  * add
  * @param first just first
  * @param second just second
  */
  void add(double first, double second) {
    this.result = first + second;
  }

  /**.
  * substruct
  * @param first just first
  * @param second just second
  */
  void substruct(double first, double second) {
    this.result = first - second;
  }

  /**.
  * div
  * @param first just first
  * @param second just second
  */
  void div(double first, double second) {
    this.result = first / second;
  }

  /**.
  * multiple
  * @param first just first
  * @param second just second
  */
  void multiple(double first, double second) {
    this.result = first * second;
  }
}
