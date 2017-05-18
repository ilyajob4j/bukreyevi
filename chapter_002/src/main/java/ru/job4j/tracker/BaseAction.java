package ru.job4j.tracker;

/**
 * Created by bukreyev on 16.05.2017.
 */
abstract class BaseAction implements IUserAction {

    private String actionName;
    private int key;

    BaseAction(String actionName, int key) {
        this.actionName = actionName;
        this.key = key;
    }

    public int key() {
        return this.key;
    };

    public abstract void execute(Input input, Tracker tracker);

    public String info() {
        return String.format("%s. %s", this.key(), this.actionName);
    }
}
