/**
package-info.
*/
package ru.job4j.professions;
/**
class desc.
*/
public abstract class Profession {
  int rank;
  String profArea;
  String sex;
  boolean highEducation;

  public int getRank() {
    return this.rank;
  }
  public String getProfArea() {
    return this.profArea;
  }
}
