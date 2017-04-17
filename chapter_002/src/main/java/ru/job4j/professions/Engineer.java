/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class info.
 */
public class Engineer extends Profession {
/**
@param name field.
@param salary field.
*/

    Engineer(String name, int salary) {
        super(name, salary);
    }
/**
@param teacher obj.
@return increased salary for teacher.
*/
    public int increaseSalary(Teacher teacher) {
        teacher.setNadbavka(5000);
        return getZarplata();
    }
/**
@param doctor field
@return increasd salary for doctor.
*/
    public int givesPremiya(Doctor doctor) {
        doctor.setNadbavka(3000);
        return getZarplata();
    }
/**
@return specific slogan.
*/
    public String slogan() {
        return "Engineer " + getName() + " says " + "\"Daesh pyatiletky za tri goda!\"";
    }
}
