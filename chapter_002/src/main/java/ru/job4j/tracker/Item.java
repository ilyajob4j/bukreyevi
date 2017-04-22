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
public String toString() {
        return "Name is "+name+"Id is "+id;
}
}
