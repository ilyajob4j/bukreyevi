/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class info.
 */
public class Teacher extends Profession {

    Teacher(String name, int zarplata) {
        super(name, zarplata);
    }

    public void teach(Doctor doctor) {
        System.out.println(doctor.slogan());
        doctor.setNadbavka(500);
    }

    public void teach(Engineer engineer) {
        System.out.println(engineer.slogan());
        engineer.setNadbavka(1000);
    }

    public void teach(Profession somebody) {
        System.out.println(somebody.slogan() + " " +
                somebody.getName());
    }

    public String slogan() {
        return "Ychitsya ychitsya i ehse raz ychitsya!!!";
    }
}
