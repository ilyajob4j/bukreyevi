/**
 * package-info.
 */
package ru.job4j.tracker;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;

/**
   class info.
 */

public class StubInputTest {
/**
   тестируем добавление.
 */
@Test
public void addTest1() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"1", "test name", "0"});
        new StartUI(input, tracker).init();
        assertEquals(tracker.getById(0).getName(), "test name");
}
/**
   Тестируем добавление.
 */
@Test
public void updateTest() {
        Tracker tracker1 = new Tracker();
        Input input1 = new StubInput(new String[] {"1", "test name", "2", "trampampam", "test name", "0"});
        new StartUI(input1, tracker1).init();
        assertThat(tracker1.findAll()[0].getName(), is("trampampam"));
}
/**
   Тестируем удаление.
 */
@Test
public void deleteTest3() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"1", "test name", "3", "0", "0"});
        new StartUI(input, tracker).init();
        assertNull(tracker.getById(0));
}
/**
   Тестируем нахождение всех элементов.
 */
@Test
public void findAll4Test4() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"1", "test name", "1", "test name2", "4", "0"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
        assertThat(tracker.findAll()[1].getName(), is("test name2"));
}
/**
   Тестируем нахождение по id.
 */
@Test
public void findByIdTest5() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"1", "test name", "0"});
        new StartUI(input, tracker).init();
        String s = tracker.getById(0).getId();
        Input input1 = new StubInput(new String[] {"5", s,  "0"});
        new StartUI(input1, tracker).init();

        assertEquals(tracker.getById(0).getId(), s);
}
/**
   Тестируем нахождение по имени.
 */
@Test
public void findByNameTest6() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"1", "test name", "6", "test name", "0"});
        new StartUI(input, tracker).init();
        assertEquals(tracker.getById(0).getName(), "test name");
}
}
