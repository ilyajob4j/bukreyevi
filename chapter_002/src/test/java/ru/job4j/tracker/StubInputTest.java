/**
   package-info.
 */
package ru.job4j.tracker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
   class info.
 */

public class StubInputTest {
/**
   тестируем что-то.
 */
@Test
public void menu1Test() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "6"});
        new StartUI(input).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));

}
}
