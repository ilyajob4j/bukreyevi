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
     *
     * @param input   in.
     * @param tracker tr.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * @param key k.
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * fills array with classes.
     */
    public void fillActions() {
        this.actions[0] = new AddItem();
        this.actions[1] = new ShowItems();
        this.actions[2] = new UpdateItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindById();
        this.actions[5] = new FindByName();
        this.actions[6] = new Exiter();
    }

    /**
     * show menu method.
     */
    public void show() {
        for (IUserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * add item class.
     */
    private static class AddItem implements IUserAction {
        /**
         * key for AddItem.
         *
         * @return 0
         */
        public int key() {
            return 0;
        }

        /**
         * execute for addItem.
         *
         * @param input   in
         * @param tracker tr
         */
        public void execute(Input input, Tracker tracker) {
            Item item = new Item();
            item.setName(input.ask("Введите имя заявки"));
            tracker.add(item);
        }

        /**
         * info for add item.
         *
         * @return info
         */
        public String info() {
            return String.format("%s. %s", this.key(), "add the new Item.");
        }
    }

    /**
     * ShowItems class.
     */
    private static class ShowItems implements IUserAction {
        /**
         * key for ShowItems.
         *
         * @return 1
         */
        public int key() {
            return 1;
        }

        /**
         * execute for ShowItems.
         *
         * @param input   in
         * @param tracker tr
         */
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                if (item != null) {
                    System.out.println(String.format("%s. %s", item.getId(), item.getName()));

                }
            }
        }

        /**
         * info for ShowItems.
         *
         * @return info
         */
        public String info() {
            return String.format("%s. %s", this.key(), "show all items");
        }
    }

    /**
     * class UpdateItem.
     */
    private static class UpdateItem implements IUserAction {
        /**
         * key method.
         *
         * @return 2
         */
        public int key() {
            return 2;
        }

        /**
         * execute for UpdateItem.
         *
         * @param input   in
         * @param tracker tr
         */
        public void execute(Input input, Tracker tracker) {
            Item item = new Item();
            item.setName(input.ask("Введите имя новой заявки"));
            String findItemByText = input.ask("Введите имя заявки, которую нужно обновить");
            tracker.update(item, findItemByText);
        }

        /**
         * info for UpdateItem.
         *
         * @return info
         */
        public String info() {
            return String.format("%s. %s", this.key(), "updating item");
        }
    }

    /**
     * DeleteItem.
     */
    private class DeleteItem implements IUserAction {
        /**
         * key for DeleteItem.
         *
         * @return 3
         */
        public int key() {
            return 3;
        }

        /**
         * execute for DeleteItem.
         *
         * @param input   in
         * @param tracker tr
         */
        public void execute(Input input, Tracker tracker) {
            tracker.delete(tracker.getItemId(new Integer(input.ask("Укажите индекс для удаления"))));
        }

        /**
         * info for DeleteItem.
         *
         * @return info.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "deleting item");
        }
    }

    /**
     * class FindById.
     */
    private class FindById implements IUserAction {
        /**
         * key for FindById.
         *
         * @return 4
         */
        public int key() {
            return 4;
        }

        /**
         * execute for FindById.
         *
         * @param input   in
         * @param tracker tr
         */
        public void execute(Input input, Tracker tracker) {
            tracker.findById(input.ask("Введите id заявки"));
        }

        /**
         * info for FindById.
         *
         * @return info
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find by id");
        }
    }

    /**
     * class FindByName.
     */
    private class FindByName implements IUserAction {
        /**
         * key for FindByName.
         *
         * @return 5.
         */
        public int key() {
            return 5;
        }

        /**
         * execute for FindByName.
         *
         * @param input   in
         * @param tracker tr
         */
        public void execute(Input input, Tracker tracker) {
            tracker.findByName(input.ask("Введите name заявки"));
        }

        /**
         * info for FindByName.
         *
         * @return info.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find by name");
        }
    }
}

/**
 * Outer class just because required in task.
 */
class Exiter implements IUserAction {
    @Override
/**
 key for Outer.
 @return 6
 */
    public int key() {
        return 6;
    }

    @Override
/**
 execute for Outer.
 @param input in
 @param tracker tr
 */
    public void execute(Input input, Tracker tracker) {
        System.out.println("Выход из программы");
        StartUI.b = false;
    }

    @Override
/**
 info for Outer.
 */
    public String info() {
        return String.format("%s. %s", this.key(), "Exit the program");

    }
}
