/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class info.
 */
public class Doctor extends Profession {

    Doctor(String name, int zarplata) {
        super(name, zarplata);
    }

    public String heal(Profession client) {
        return "Somebody healed " + client.getName();
    }

    public String heal(Teacher client) {

        return "Teacher " + client.getName() + " healed";
    }

    public String heal(Engineer client) {
        return "Engineer healed" + client.getName();
    }

    public String slogan() {
        return "Na boga nadeyasya, a sam ne boley";
    }
}
