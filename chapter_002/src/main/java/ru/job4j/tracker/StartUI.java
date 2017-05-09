/**
 * package-info.
 */
package ru.job4j.tracker;

/**
 * class info.
 */
public class StartUI {
    /**
     * for while loop.
     */
    static boolean b = true;

    /**
     * input new input.
     */
    private Input input;
    /**
     * new tracker.
     */
    private Tracker tracker;

    /**
     * constructor.
     *
     * @param input   new input.
     * @param tracker new tracker.
     */
    StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * main.
     *
     * @param args - arguments.
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();
    }

    /**
     * init method.
     */
    void init() {
        MenuTracker menu = new MenuTracker(input, tracker);
        menu.fillActions();
        //noinspection InfiniteLoopStatement
        do {
            menu.show();
            String key = input.ask("\nSelect menu item: ");
            menu.select(Integer.parseInt(key));

        } while (b);
    }
}
