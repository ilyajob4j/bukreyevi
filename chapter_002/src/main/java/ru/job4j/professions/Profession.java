/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class desc.
 */
abstract class Profession {
    private String name;
    private boolean highEducation;
    private int zarplata;

    public int getZarplata() {
        return zarplata;
    }

    public String getName() {
        return this.name;
    }

    public boolean isHighEducated() {
        return highEducation;
    }
}

