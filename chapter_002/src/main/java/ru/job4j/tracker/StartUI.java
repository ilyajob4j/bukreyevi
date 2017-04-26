/**
 * package-info.
 */
package ru.job4j.tracker;

/**
 * class info.
 */

public class StartUI {
/**
 * @param b keeps dialog alive.
 */
private static boolean b = true;

/**
 * enum class.
 */
public enum TrackerMenu {
        /**
           add.
         */
        ADD("1"),
        /**
           update.
         */
        UPDATE("2"),
        /**
           delete.
         */
        DELETE("3"),
        /**
           FIND_ALL.
         */
        FIND_ALL("4"),
        /**
           findby.
         */
        FIND_BY_ID("5"),
        /**
           find by name.
         */
        FIND_BY_NAME("6"),
        /**
           exit.
         */
        EXIT("0");
        /**
           @param i - field.
         */
        private String i;
/**
   @param i arguments.
 */
        TrackerMenu(String i) {
                this.i = i;
        }
/**
   @param id arguments
   @return e obj
 */
        static TrackerMenu searchEnum(String id) {
                for (TrackerMenu e : TrackerMenu.values()) {
                        if (e.i.equals(id)) {
                                return e;
                        }
                }
                return null;
        }
}

/**
 * main.
 *
 * @param args - arguments.
 */
public static void main(String[] args) {
        StartUI st = new StartUI();
        st.init();
}

/**
 * init method.
 */
private void init() {
        Item item = new Item();
        ConsoleInput consoleInput = new ConsoleInput();
        Tracker tracker = new Tracker();
        while (b) {
                String name = consoleInput.ask("Добро пожаловать в систему заявок. Доступные варианты:\n1. Добавить заявку\n2. Обновить заявку (нужно указать обновляемый элемент)\n3. Удаление заявки по номеру\n4. Получить список всех заявок\n5. Найти заявку по названию\n6. Найти заявку по номеру\n0. Закончить работу с приложением\n Выберите вариант");
                TrackerMenu t = StartUI.TrackerMenu.searchEnum(name);
                switch (t) {
                case ADD:
                        item.setName(consoleInput.ask("Введите имя заявки"));
                        tracker.add(item);
                        break;
                case UPDATE:
//                    tracker.update();
                        System.out.println("Обновили, возвращаемся в главное меню.");
                        break;
                case DELETE:
                        tracker.delete(tracker.getItemId(new Integer(consoleInput.ask("Укажите номер заявки для удаления"))));
                        System.out.println("Удаление наверное произошло, возвращаемся в главное меню");
                        break;
                case FIND_ALL:
                        for (Item i : tracker.findAll()) {
                                System.out.print(i + ",");
                        }
                        System.out.println("\nНапечатали, возвращаемся в главное меню.");
                        break;
                case FIND_BY_ID:
                        for (Item i : tracker.findByName(consoleInput.ask("Введите Name"))) {
                                System.out.println(i + ",");
                        }
                        System.out.println("\nНапечатали, возвращаемся в главное меню.");
                        break;
                case FIND_BY_NAME:
                        System.out.println(tracker.findById(consoleInput.ask("Введите ID")));
                        System.out.println("Напечатали, возвращаемся в главное меню.");
                        break;
                case EXIT:
                        System.out.println("До новых встреч!");
                        b = false;
                        break;
                default:
                        System.out.println("Введен недопустимый вариант");
                }
        }
}
}
