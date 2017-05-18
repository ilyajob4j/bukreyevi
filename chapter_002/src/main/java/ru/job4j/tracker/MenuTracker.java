/**
 * package-info.
 */
package ru.job4j.tracker;

/**
 * class info.
 */
class MenuTracker {
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
    private int position = 0;

    /**
     * MenuTracker method.
     *
     * @param input   in.
     * @param tracker tr.
     */
    MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * @param key k.
     */
    void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * fills array with classes.
     */
    void fillActions() {
        this.actions[position++] = new MenuTracker.AddItem("Add Item", 0);
        this.actions[position++] = new ShowItems("Show Items", 1);
        this.actions[position++] = new UpdateItem("Update Item", 2);
        this.actions[position++] = new DeleteItem("Delete Item", 3);
        this.actions[position++] = new FindById("FindById", 4);
        this.actions[position++] = new FindByName("FindByName", 5);
        this.actions[position++] = new Exiter("Exit", 6);
    }

    void addAction(IUserAction action) {
        this.actions[position++] = action;
    }

    /**
     * show menu method.
     */
    void show() {
        for (IUserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    int[] fillerForRange() {
        int[] result = new int[actions.length];
        for (int x = 0; x < actions.length; x++) {
            result[x] = x;
        }
        return result;
    }

    /**
     * add item class.
     */
    private static class AddItem extends BaseAction {

        AddItem(String actionName, int key) {
            super(actionName, key);
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
    }

    /**
     * ShowItems class.
     */
    private static class ShowItems extends BaseAction {

        ShowItems(String name, int key) {
            super(name, key);
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
    }

    /**
     * class UpdateItem.
     */
    private static class UpdateItem extends BaseAction {
        UpdateItem(String actionName, int key) {
            super(actionName, key);
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
    }

    /**
     * DeleteItem.
     */
    private class DeleteItem extends BaseAction {
        public DeleteItem(String actionName, int key) {
            super(actionName, key);
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
    }

    /**
     * class FindById.
     */
    private class FindById extends BaseAction {
        public FindById(String actionName, int key) {
            super(actionName, key);
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
    }

    /**
     * class FindByName.
     */
    private class FindByName extends BaseAction {
        public FindByName(String actionName, int key) {
            super(actionName, key);
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
    }
}

/**
 * Outer class just because required in task.
 */
class Exiter extends BaseAction {
    Exiter(String actionName, int key) {
        super(actionName, key);
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
}
