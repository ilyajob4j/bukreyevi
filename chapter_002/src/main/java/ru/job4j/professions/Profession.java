/**
 * package-info.
 */
package ru.job4j.professions;

/**
 * class desc.
 */
abstract class Profession {
  /**
  @param name field.
  */
    private String name;
    /**
    @param zarplata field initial.
    */
    private int zarplata;
    /**
    @param premiya field.
    */
    private int premiya = 0;
/**
@param name field
@param zarplata field
*/
    Profession(String name, int zarplata) {
        this.name = name;
        this.zarplata = zarplata;
    }
/**
@return zp+premiya.
*/
    public int getZarplata() {
        return zarplata + premiya;
    }
/**
@param nadbavka - increases zarplata.
*/
    public void setNadbavka(int nadbavka) {
        this.zarplata += nadbavka;
    }
/**
@return field name.
*/
    public String getName() {
        return this.name;
    }
    /**
    method desc.
    @return specific slogan.
    */
    abstract String slogan();
}
