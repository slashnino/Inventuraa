package org.hopto.nino.inventory;

/**
 * Class Inventar
 */
public class Inventar {

  //
  // Fields
  //

  public int inv_broj;
  private String naziv;
  private int kolicina;
  private String lokacija;
  
  //
  // Constructors
  //
  public Inventar () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of inv_broj
   * @param newVar the new value of inv_broj
   */
  public void setInv_broj (int newVar) {
    inv_broj = newVar;
  }

  /**
   * Get the value of inv_broj
   * @return the value of inv_broj
   */
  public int getInv_broj () {
    return inv_broj;
  }

  /**
   * Set the value of naziv
   * @param newVar the new value of naziv
   */
  private void setNaziv (String newVar) {
    naziv = newVar;
  }

  /**
   * Get the value of naziv
   * @return the value of naziv
   */
  private String getNaziv () {
    return naziv;
  }

  /**
   * Set the value of kolicina
   * @param newVar the new value of kolicina
   */
  private void setKolicina (int newVar) {
    kolicina = newVar;
  }

  /**
   * Get the value of kolicina
   * @return the value of kolicina
   */
  private int getKolicina () {
    return kolicina;
  }

  /**
   * Set the value of lokacija
   * @param newVar the new value of lokacija
   */
  private void setLokacija (String newVar) {
    lokacija = newVar;
  }

  /**
   * Get the value of lokacija
   * @return the value of lokacija
   */
  private String getLokacija () {
    return lokacija;
  }

  //
  // Other methods
  //

  /**
   */
  public void prikaz_inv()
  {
  }


}
