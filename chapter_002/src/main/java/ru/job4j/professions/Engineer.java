/**
package-info.
*/
package ru.job4j.professions;
/**
class info.
*/
public class Engineer extends Profession {
  boolean isHungry;

  public void make(Material material) {
    System.out.println("making smth");
  }
  public int gettigSalary() {
    System.out.println("goes to account department and gets money");
  }
  public void spendSalary() {
    System.out.println("spending money");
  }
}
