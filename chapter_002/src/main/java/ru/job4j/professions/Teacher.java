/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class info.
 */
public class Teacher extends Profession {
    private boolean hasSertificate;
    private int leadClasses;

    public void teach(String s) {
        System.out.println("returns true if pupil got the lesson");
    }

    public int jokesPerLesson(int x) {
        System.out.println("returns how many times joke was");
        return x;
    }

    public void chuckOut(String pupil) {
        System.out.println("teacher chucks out" + pupil + "of the class");
    }
}
