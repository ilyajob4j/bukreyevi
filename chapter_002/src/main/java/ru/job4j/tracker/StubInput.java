/**
   package-info.
 */
package ru.job4j.tracker;
/**
   class info.
 */
public class StubInput implements Input {
/**
   answers.
 */
private String[] answers;
/**
   counter.
 */
private int counter = 0;
/**
   @param answers ans.
 */
public StubInput(String[] answers) {
        this.answers = answers;
}
/**
   @param question quest.
   @return element.
 */

public String ask(String question) {
        return answers[counter++];
}
}
