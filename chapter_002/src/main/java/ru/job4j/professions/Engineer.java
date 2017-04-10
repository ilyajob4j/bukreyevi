/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class info.
 */
public class Engineer extends Profession {
    private boolean isHungry;

    public void make(String material) {
        System.out.println("Engineer" + getName() + "making smth" + material);
    }

    public int gettigSalary(int x) {
        if (isHungry) {
            System.out.println("goes to account department and gets money");
        }
        return 0;
    }

    public void spendSalary() {
        if (getZarplata() > 0) {
            System.out.println("spending money");
        } else {
            System.out.println("No money no honey");
        }
    }
}
