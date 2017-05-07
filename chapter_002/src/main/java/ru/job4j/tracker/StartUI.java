/**
 * package-info.
 */
package ru.job4j.tracker;

/**
 * class info.
 */
public class StartUI {
    /**
     * input new input.
     */
    private Input input;
    /**
     * new tracker.
     */
//    private Tracker tracker;

    /**
     * constructor.
     *
     * @param input   new input.
     * @param tracker new tracker.
     */
    StartUI(Input input, Tracker tracker) {
        this.input = input;
//        this.tracker = tracker;
    }

    /**
     * @param b keeps dialog alive.
     */
    private boolean b = true;

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
         * i - field.
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
        Input input = new ConsoleInput();
        new StartUI(input, null).init();
    }

    /**
     * init method.
     */
    void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(input, tracker);
        menu.fillActions();
        do {
            menu.show();
            String key = input.ask("\nSelect menu item: ");
            menu.select(Integer.parseInt(key));

        } while (!"y".equals(this.input.ask("Exit? y/n")));
    }
}
