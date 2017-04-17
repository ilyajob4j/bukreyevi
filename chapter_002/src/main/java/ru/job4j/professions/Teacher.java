/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class info.
 */
public class Teacher extends Profession {
/**
@param name - field
@param zarplata - field
*/
    Teacher(String name, int zarplata) {
        super(name, zarplata);
    }
/**
@param doctor field
*/
    public void teach(Doctor doctor) {
        System.out.println(doctor.slogan());
        doctor.setNadbavka(500);
    }
/**
@param engineer field
*/
    public void teach(Engineer engineer) {
        System.out.println(engineer.slogan());
        engineer.setNadbavka(1000);
    }
/**
@param somebody - common case.
*/
    public void teach(Profession somebody) {
        System.out.println(somebody.slogan() + " "
        + somebody.getName());
    }
/**
@return specific slogan.
*/
    public String slogan() {
        return "Teacher " + getName() + " says: "
        + "\"Ychitsya ychitsya i ehse raz ychitsya!!!\"";
    }
}
