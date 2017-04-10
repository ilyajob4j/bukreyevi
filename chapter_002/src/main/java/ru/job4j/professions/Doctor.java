/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class info.
 */
public class Doctor extends Profession {
    private boolean hasResearch;

    public void heal(String client) {
        if (hasResearch) {
            System.out.println("Doctor " + getName() + " heals " + client);
        } else {
            System.out.println("Not enough qualification");
        }
    }

    public void giveAdvice() {
        if (isHighEducated()) {
            System.out.println("Doctor" + getName() + "gives advise to client");
        } else {
            System.out.println("Not enough qualification");
        }
    }

    public void shakeHand() {
        System.out.println("Doctor shakes your hand");
    }
}
