package ru.job4j.tracker;

/**
 * Created junior by Ilya on 5/13/17.
 */
public class ValidateInput extends ConsoleInput {
    public int ask(String q, int[] range) {
        boolean b = true;
        int value = -1;
        do {
            try {
                value = super.ask(q, range);
                b = false;
            }
            catch (MenuException moe) {
                System.out.println("Неверный номер пункта меню");
            }
            catch (NumberFormatException nfe) {
                System.out.println("Еще какая-то ошибка");
            }
        }
        while (b);
        return value;
    }
}
