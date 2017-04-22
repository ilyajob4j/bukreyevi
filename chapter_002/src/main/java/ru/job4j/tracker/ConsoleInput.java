/**
   package-info.
 */
package ru.job4j.tracker;

import java.util.Scanner;
/**
 * class info.
 */
public class ConsoleInput {
/**
   new tracker for session.
 */
private Tracker tracker = new Tracker();
/**
   @param b - keeps dialog live.
 */
private boolean b = true;
/**
   actually main user class.
 */
public void start() {
        while (b) {
                System.out.println("Добро пожаловать в систему заявок. Доступные варианты:\n1. Добавить заявку\n2. Обновить заявку (нужно указать обновляемый элемент)\n3. Удаление заявки по номеру\n4. Получить список всех заявок\n5. Найти заявку по названию\n6. Найти заявку по номеру\n0. Закончить работу с приложением\n Выберите вариант");
                int mainMenuCase = userIntInput();
                switch (mainMenuCase) {
                case 1: tracker.add(setItemFromConsole());
                        System.out.println("Добавили, возвращаемся в главное меню.");
                        break;
                case 2: tracker.update(setItemFromConsole());
                        System.out.println("Обновили, возвращаемся в главное меню.");
                        break;
                case 3: System.out.println("Укажите номер заявки для удаления");
                        tracker.delete(tracker.getItemId(userIntInput()));
                        System.out.println("Удаление наверное произошло, возвращаемся в главное меню");
                        break;
                case 4: for (Item i : tracker.findAll()) {
                                System.out.print(i + ",");
                }
                        System.out.println("\nНапечатали, возвращаемся в главное меню.");
                        break;
                case 5: for (Item i : tracker.findByName(userStringInput())) {
                                System.out.println(i + ",");
                }
                        System.out.println("\nНапечатали, возвращаемся в главное меню.");
                        break;
                case 6: System.out.println(tracker.findById(userStringInput()));
                        System.out.println("Напечатали, возвращаемся в главное меню.");
                        break;
                case 0: System.out.println("До новых встреч!");
                        b = false;
                        break;
                default: System.out.println("Введен недопустимый вариант");
                }
        }
}


/**
   user string input.
   @return string input.
 */
public String userStringInput() {
        Scanner ss = new Scanner(System.in);
        return ss.next();
}
/**
   user num input.
   @return int input.
 */
public int userIntInput() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
}
/**
   @return specified by user item.
 */
public Item setItemFromConsole() {
        System.out.println("Введите имя заявки");
        Item item = new Item();
        item.setName(userStringInput());
        return item;
}
}
