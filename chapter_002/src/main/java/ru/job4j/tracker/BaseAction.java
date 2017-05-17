package ru.job4j.tracker;

/**
 * Created by bukreyev on 16.05.2017.
 */
abstract class BaseAction implements IUserAction {

   private String actionName;

    BaseAction(String actionName) {
        this.actionName = actionName;
            }

    public abstract int key();

    public abstract void execute(Input input, Tracker tracker);

    public String info() {
        return String.format("%s. %s", this.key(), this.actionName);
    }
}
