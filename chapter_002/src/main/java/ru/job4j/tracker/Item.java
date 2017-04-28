/**
   package-info.
 */
package ru.job4j.tracker;

/**
   class info.
 */
public class Item {
/**
   @param id special string identificator.
 */
private String id;
/**
   @param name - name of id.
 */
private String name;
/**
   @return id getter.
 */
public String getId() {
        return this.id;
}
/**
   @param s id setter.
 */
public void setId(String s) {
        this.id = s;
}
/**
   @param s name setter
 */
public void setName(String s) {
        this.name = s;
}
/**
   @return getter of name.
 */
public String getName() {
        return this.name;
}
/**
   @return toString override.
 */
public String toString() {
        return "Name is " + name + " Id is " + id;
}

// @Override
// public boolean equals(Object obj) {
//         Item item = (Item) obj;
//         return this.getName().equals(item.getName());
// }
//
// @Override
// public int hashCode() {
//         return super.hashCode();
// }
}
