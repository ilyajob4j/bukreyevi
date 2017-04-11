/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class desc.
 */
abstract class Profession {
    private String name;
    private int zarplata;
    private int premiya = 0;

    Profession(String name, int zarplata) {
        this.name = name;
        this.zarplata = zarplata;
    }

    public int getZarplata() {
        return zarplata+premiya;
    }

    public void setNadbavka(int nadbavka) {
        this.zarplata += nadbavka;
    }

    public String getName() {
        return this.name;
    }

    abstract String slogan();
}

