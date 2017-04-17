/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class info.
 */
public class Doctor extends Profession {
/**
@param name field.
@param zarplata field.
*/
    Doctor(String name, int zarplata) {
        super(name, zarplata);
    }
/**
@param client field.
@return common case heal.
*/
    public String heal(Profession client) {
        return "Somebody healed " + client.getName();
    }
/**
@param client field.
@return heal info for Teacher.
*/
    public String heal(Teacher client) {
        return "Teacher " + client.getName() + " healed";
    }
    /**
    @param client field.
    @return heal info for Engineer.
    */
    public String heal(Engineer client) {
        return "Engineer healed" + client.getName();
    }
    /**
    @return specific slogan
    */
    public String slogan() {
        return "Doctor " + getName() + " says " + "\"Na boga nadeyasya, a sam ne boley\"";
    }
}
