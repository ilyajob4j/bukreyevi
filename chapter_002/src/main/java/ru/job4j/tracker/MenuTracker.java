/**
 * package-info.
 */
package ru.job4j.tracker;

/**
 * class info.
 */
public class MenuTracker {
    /**
     * input info.
     */
    private Input input;
    /**
     * tracker info.
     */
    private Tracker tracker;
    /**
     * actions actions.
     */
    private IUserAction[] actions = new IUserAction[7];
    /**
     * MenuTracker method.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void fillActions() {
        this.actions[0] = new AddItem();
        this.actions[1] = new ShowItems();
        this.actions[2] = new UpdateItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindById();
        this.actions[5] = new FindByName();
        this.actions[6] = new Outer();
    }

    public void show() {
        for (IUserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private static class AddItem implements IUserAction {
        public int key() {
            return 0;
        }

        public void execute(Input input, Tracker tracker) {

            Item item = new Item();
            item.setName(input.ask("Введите имя заявки"));
            tracker.add(item);
        }

        public String info() {
            return String.format("%s. %s", this.key(), "add the new Item.");
        }
    }

    private static class ShowItems implements IUserAction {
        public int key() {
            return 1;
        }

        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(String.format("%s. %s", item.getId(), item.getName()));
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "show all items");
        }
    }

    private static class UpdateItem implements IUserAction {
        public int key() {
            return 2;
        }

        public void execute(Input input, Tracker tracker) {
            Item item = new Item();
            item.setName(input.ask("Введите имя новой заявки"));
            String findItemByText = input.ask("Введите имя заявки, которую нужно обновить");
            tracker.update(item, findItemByText);
        }

        public String info() {
            return String.format("%s. %s", this.key(), "updating item");
        }
    }

    private class DeleteItem implements IUserAction {
        public int key() {
            return 3;
        }

        public void execute(Input input, Tracker tracker) {
            tracker.delete(tracker.getItemId(new Integer(input.ask("Укажите индекс для удаления"))));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "deleting item");
        }
    }

    private class FindById implements IUserAction {
        public int key() {
            return 4;
        }

        public void execute(Input input, Tracker tracker) {
            tracker.findById(input.ask("Введите id заявки"));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find by id");
        }
    }

    private class FindByName implements IUserAction {
        public int key() {
            return 5;
        }

        public void execute(Input input, Tracker tracker) {
            tracker.findByName(input.ask("Введите name заявки"));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find by name");
        }

    }
}

class Outer implements IUserAction {
    @Override
    public int key() {
        return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {

    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Outer class");

    }
}
