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

    public int ask(String q, int[] range) {
        int key = Integer.valueOf(this.ask(q));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuException("Ошибка NFE");
        }
    }
}
