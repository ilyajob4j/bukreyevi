/**
 * package-info.
 */
package ru.job4j.tracker;

import java.util.Scanner;

/**
 * class info.
 */
class ConsoleInput implements Input {
    /**
     * @param scanner is scanner.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * actually main user class.
     *
     * @param text - main menu.
     * @return text.
     */
    public String ask(String text) {
        System.out.println(text);
        return scanner.next();
    }
}
//windows git test