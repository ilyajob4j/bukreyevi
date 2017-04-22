import java.util.Scanner;
/**
   package-info
 */
package ru.job4j.tracker;
/**
   class info
 */
public class ConsoleInput {
Tracker tracker;
Item item;
boolean b = true;

public void start() {
        while (b) {
                System.out.println("Добро пожаловать в систему заявок.\n
            Доступные варианты:\n1. Добавить заявку\n2. Обновить заявку
            (нужно указать обновляемый элемент)\n3. Удаление заявки по номеру\n
            4. Получить список всех заявок\n5. Найти заявку по названию\n
            6. Найти заявку по номеру\n0. Закончить работу с приложением\n
            Выберите вариант");
                Scanner userInput = new Scanner(System.in);
                int mainMenuCase = userInput.nextInt();;
                switch(mainMenuCase) {
                case 1: {
                        tracker.add(setItemNameFromConsole());
                        System.out.println("Добавили, возвращаемся в главное меню.");
                        break;
                }
                case 2: {
                        tracker.update(setItemNameFromConsole());
                        System.out.println("Обновили, возвращаемся в главное меню.");
                        break;
                }
                case 3: {
                        System.out.println("Укажите номер заявки для удаления");
                        Scanner s = new Scanner(System.in);
                        try {
                                tracker.delete(s.next());
                        } catch(IndexOutOfBoundsException e) {
                                System.out.println("Ячейка пуста! Удаление не произведено\n"
                                                   +e.getStackTrace());

                        }
                        System.out.println("Удаление успешно, возвращаемся в главное меню");
                        break;
                }
                case 4: {
                        for(String s : tracker.findAll()) {
                                System.out.println(s);
                        }
                        System.out.println("Напечатали, возвращаемся в главное меню.");
                        break;
                }
                case 5: {
                        tracker.findByName(setItemNameFromConsole());
                        break;
                }
                case 6: {
                        break;
                }
                case 0: {
                        System.out.println("До новых встреч!");
                        b = false;
                        break;
                }
                case default: {
                        System.out.println("Введен недопустимый вариант");
                }
                }
        }

}
public Item setItemNameFromConsole() {
        System.out.println("Введите имя заявки");
        Scanner s = new Scanner(System.in);
        return item.setName(s.next());
}
}
