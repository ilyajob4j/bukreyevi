/**
 * package-info.
 */
package ru.job4j.tracker;

/**
 * class info.
 */
public class StartUI {
    int range [] = {0,1,2,3,4,5,6};
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
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();
    }

    /**
     * init method.
     */
    void init() {
        MenuTracker menu = new MenuTracker(input, tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(input.ask("\nSelect menu Item",range));
        } while (b);
    }
}
