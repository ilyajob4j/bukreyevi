/**
 * package-info.
 */
package ru.job4j.tracker;

/**
 * class info.
 */
public class StartUI {
/**
 * @param input new input.
 */
private Input input;

/**
 * constructor.
   @param input new input.
 */
StartUI(Input input) {
        this.input = new ConsoleInput();
}

/**
 * @param b keeps dialog alive.
 */
private static boolean b = true;

/**
 * enum class.
 */
public enum TrackerMenu {
        /**
         * add.
         */
        ADD("1"),
        /**
         * update.
         */
        UPDATE("2"),
        /**
         * delete.
         */
        DELETE("3"),
        /**
         * FIND_ALL.
         */
        FIND_ALL("4"),
        /**
         * findby.
         */
        FIND_BY_ID("5"),
        /**
         * find by name.
         */
        FIND_BY_NAME("6"),
        /**
         * exit.
         */
        EXIT("0");
        /**
         * @param i - field.
         */
        private String i;

        /**
         * @param i arguments.
         */
        TrackerMenu(String i) {
                this.i = i;
        }

        /**
         * @param id arguments
         * @return e obj
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
//        Input input = new ConsoleInput();
        new StartUI(new StubInput(new String[] {"1", "test", "0"})).init();
}

/**
 * init method.
 */
void init() {
        while (b) {
                Tracker tracker = new Tracker();
                String menu = input.ask("Добро пожаловать в систему заявок. Доступные варианты:\n1. Добавить заявку\n2. Обновить заявку (нужно указать обновляемый элемент)\n3. Удаление заявки по номеру\n4. Получить список всех заявок\n5. Найти заявку по названию\n6. Найти заявку по номеру\n0. Закончить работу с приложением\n Выберите вариант");
                TrackerMenu t = StartUI.TrackerMenu.searchEnum(menu);
                switch (t) {
                case ADD:
                        Item item = new Item();
                        item.setName(input.ask("Введите имя заявки"));
                        tracker.add(item);
                        break;
                case UPDATE:
                        Item item2 = new Item();
                        item2.setName(input.ask("Введите имя новой заявки"));
                        String findItemByText = input.ask("Введите имя заявки, которую нужно обновить");
                        tracker.update(item2, findItemByText);
                        System.out.println("Обновили, возвращаемся в главное меню.");
                        break;
                case DELETE:
                        tracker.delete(tracker.getItemId(new Integer(input.ask("Укажите номер заявки для удаления"))));
                        System.out.println("Удаление наверное произошло, возвращаемся в главное меню");
                        break;
                case FIND_ALL:
                        for (Item i : tracker.findAll()) {
                                System.out.print(i + ",");
                        }
                        System.out.println("\nНапечатали, возвращаемся в главное меню.");
                        break;
                case FIND_BY_ID:
                        for (Item i : tracker.findByName(input.ask("Введите Name"))) {
                                System.out.println(i + ",");
                        }
                        System.out.println("\nНапечатали, возвращаемся в главное меню.");
                        break;
                case FIND_BY_NAME:
                        System.out.println(tracker.findById(input.ask("Введите ID")));
                        System.out.println("Напечатали, возвращаемся в главное меню.");
                        break;
                case EXIT:
                        System.out.println("До новых встреч!");
                        b = false;
                        break;
                default:
                        System.out.println("Введен недопустимый вариант");
                        break;
                }
        }
}
}
