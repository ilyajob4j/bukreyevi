
/**
* CalculatorTest
*/
package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
* CalculatorTest, tests 4 arithmetics actions
* @author Bukreyev Ilya
* @version 1.0
* @since 20/03/2017
*/
public class CalculatorTest {

  /**.
  * whenAddOnePlusOneThenTwo
  */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

/**.
* whenFirstMinusSecondThenTwo
*/
    @Test
    public void whenFirstMinusSecondThenTwo() {
      Calculator calc = new Calculator();
      calc.substruct(4D, 2D);
      double result = calc.getResult();
      double expected = 2D;
      assertThat(result, is(expected));
    }

    /**.
    * whenFirstDivSecondThanTwo
    */
    @Test
    public void whenFirstDivSecondThanTwo() {
      Calculator calc = new Calculator();
      calc.div(6D, 3D);
      double result = calc.getResult();
      double expected = 2D;
      assertThat(result, is(expected));
    }

    /**.
    * whenFirstMultipleTwoThanTwo
    */
    @Test
    public void whenFirstMultipleTwoThanTwo() {
      Calculator calc = new Calculator();
      calc.multiple(1D, 2D);
      double result = calc.getResult();
      double expected = 2D;
      assertThat(result, is(expected));
    }
}
