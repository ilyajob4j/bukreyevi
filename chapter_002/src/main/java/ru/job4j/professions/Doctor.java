/**
package-info.
*/
package ru.job4j.professions;
/**
class info.
*/
public class Doctor extends Profession {
  boolean hasResearch;

  public String heal(String client) {
    System.out.println("Doctor "+name+" heals "+client);
  }
  public void giveAdvice() {
    System.out.println("Doctor gives advise to client");
  }
  public void shakeHand() {
    System.out.println("Doctor shakes your hand");
  }
}
