/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class info.
 */
public class Engineer extends Profession {

    Engineer(String name, int salary) {
        super(name, salary);
    }

    public int increaseSalary(Teacher teacher) {
        teacher.setNadbavka(5000);
        return getZarplata();
    }

    public int givesPremiya(Doctor doctor) {
        doctor.setNadbavka(3000);
        return getZarplata();
    }

    public String slogan() {
        return "Daesh pyatiletky za tri goda!";
    }
}
