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
   @param desc - description.
 */
private String desc;
/**
   @param created - created date and time.
 */
private long created;
/**
   @param comments - some text.
 */
private String[] comments;
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
   @return gettet of name.
 */
public String getName() {
        return this.name;
}
/**
   @param obj desc.
   @return desc.
 */
}
