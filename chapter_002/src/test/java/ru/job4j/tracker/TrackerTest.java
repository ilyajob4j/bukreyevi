/**
   package-info.
 */
package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
/**
   class info.
 */
public class TrackerTest {
/**
   Создаем Item и даем ему имя. Добавляем его в tracker. Создаем новый объект
   типа Item и записываем в него значение из места, куда должен был записатся
   объект. Проверяем, что он не пустой. Проверяем, что имя этого результата
   совпадает с изначально установленным "Petr".
 */
@Test
public void addItemToTracker() {
        Item itemA = new Item();
        itemA.setName("Petr");

        Tracker tracker = new Tracker();
        tracker.add(itemA);
        Item result = tracker.getById(0);
        assertNotNull(result);
        assertEquals("Petr", result.getName());
}
/**
   Создаем Item и устанавливаем для него имя. Добавляем в tracker. Узнаем Id
   добавленного объекта и вызываем метод delete объекта tracker и передаем ему
   Id для поиска данного объекта. Проверяем, что в массиве в ячейке стал null.
 */
@Test
public void deleteItem() {
        Item itemA = new Item();
        itemA.setName("Vasya");

        Tracker tracker = new Tracker();
        tracker.add(itemA);
        String y = tracker.getItemId(0);
        tracker.delete(y);
        assertNull(tracker.getById(0));
}
/**
   Создаем объект класса Item и устанавливаем значение поля равное "Bob". Создаем
   обект класса Tracker и добавляем в него этот элемент, запоминаем id добавленного
   объекта. Создаем новый объект класса Item и задаем новое имя "Kyzya", присваиваем
   этому объекту такой же Id, как у "Bob". Вызываем метод update и передаем в него
   второй объект, который обновит уже существующий объект по полю Name. Проверяем,
   что в массиве поле name у изначального объекта изменилось на "Kyzya".
 */
@Test
public void updateItem() {
        Item itemA = new Item();
        itemA.setName("Bob");

        Tracker tracker = new Tracker();
        tracker.add(itemA);
        String y = itemA.getId();

        Item itemB = new Item();
        itemB.setName("Kyzya");
        itemB.setId(y);
        tracker.update(itemB);
        assertEquals("Kyzya", tracker.getById(0).getName());
}
/**
   Выдать все не пустые ячейки. Сравнить, что полученные результаты соответствуют
   тому, что было перед этим добавлено.
 */
@Test
public void findAllItems() {
        Item itemA = new Item();
        itemA.setName("Vasya");
        Item itemB = new Item();
        itemB.setName("Kyzya");

        Tracker tracker = new Tracker();
        tracker.add(itemA);
        itemA.setId(tracker.getItemId(0));
        tracker.add(itemB);
        itemB.setId(tracker.getItemId(1));

        Item[] result = tracker.findAll();
        Item[] expected = new Item[] {itemA, itemB, null, null, null, null, null, null, null, null};
        assertArrayEquals(expected, result);

}
/**
   Найти объект с заданным Id. Сравнить добавленный объект с тем, который был
   перед этим создан.
 */
@Test
public void findItemById() {
        Item itemA = new Item();
        Tracker tracker = new Tracker();
        tracker.add(itemA);

        Item result = tracker.findById(itemA.getId());
        assertEquals(itemA, result);
}
/**
   Найти объекты с заданным именем. Сравнить полученные результаты.
 */
@Test
public void findItemByName() {
        Item itemA = new Item();
        itemA.setName("Vasya");

        Tracker tracker = new Tracker();
        tracker.add(itemA);
        Item[] result = tracker.findByName(itemA.getName());
        Item[] expected = new Item[] {itemA, null, null, null, null, null, null, null, null, null};
        assertArrayEquals(expected, result);
}
}
