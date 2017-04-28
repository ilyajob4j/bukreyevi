/**
   Требования к задаче:
   1. Реализовать класс Tracker. Класс трекер - это обертка над массивом;
   2. В классе должно быть поле private Item[] items;
        a. Поле-указатель на позицию в массиве.
   3. Данный класс используется, как хранилище для заявок;
   4. В нем должны быть следующие методы:
   добавление заявок - public Item add(Item);
   редактирование заявок - public void update(Item);
   удаление заявок - public void delete(Item);
   получение списка всех заявок - public Item[] findAll();
   получение списка по имени - public Item[] findByName(String key);
   получение заявки по id - public Item findById(String id);
   5. На все методы необходимо написать тесты.
 */
package ru.job4j.tracker;
/**
   class tracker.
 */
import java.util.Random;
/**
   class info.
 */
public class Tracker {
/**
 * @param Item[] array of items.
 */
private Item[] items = new Item[10];
/**
 * @param pointer - current position in array;
 */
private int pointer = 0;
/**
 * @param RN parameter.
 */
private static final Random RN = new Random();
/**
 * @param item - just item
 * @return item.
 */
public Item add(Item item) {
        item.setId(String.valueOf(System.currentTimeMillis() + RN.nextInt()));
        this.items[pointer++] = item;
        return item;
}
/**
   @param item updates this item.
   @param searchByName finds item to update.
 */
public void update(Item item, String searchByName) {
        for (int i = 0; i < items.length; i++) {
                if (items[i] != null && items[i].getName().equals(searchByName)) {
                        items[i] = item;
                        break;
                }
        }
}
/**
   @param id "deletes" item with specific id
 */
public void delete(String id) {
        for (int i = 0; i < items.length; i++) {
                if (items[i] != null && items[i].getId().equals(id)) {
                        items[i] = null;
                        break;
                }
        }
}
/**
   @return array of items
 */
public Item[] findAll() {
        Item[] tmp = new Item[items.length];
        for (int i = 0, j = 0; i < tmp.length; i++) {
                if (this.items[i] != null) {
                        tmp[j++] = items[i];
                }
        }
        return tmp;
}
/**
   @param key compares with item name
   @return result
 */
public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        for (int i = 0, j = 0; i < items.length; i++) {
                if (items[i] != null && items[i].getName().equals(key)) {
                        result[j++] = items[i];
                }
        }
        return result;
}
/**
   @param id searching item.
   @return item, if founded
 */
public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
                if (item != null && item.getId().equals(id)) {
                        result = item;
                        break;
                }
        }
        return result;
}
/**
   @param x input
   @return result
 */
public Item getById(int x) {
        return items[x];
}
/**
   gets item's string id.
   @param x array's position.
   @return string id
 */
public String getItemId(int x) {
        return items[x].getId();
}
}
