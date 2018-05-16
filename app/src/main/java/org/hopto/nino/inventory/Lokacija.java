package org.hopto.nino.inventory;

/**
 * Class Lokacija
 */
public class Lokacija {

  //
  // Fields
  //

  private int ID;
  private String grad;
  private String drzava;
  private int post_broj;
  private String naziv_prostora;
  
  //
  // Constructors
  //
  public Lokacija () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of ID
   * @param newVar the new value of ID
   */
  private void setID (int newVar) {
    ID = newVar;
  }

  /**
   * Get the value of ID
   * @return the value of ID
   */
  private int getID () {
    return ID;
  }

  /**
   * Set the value of grad
   * @param newVar the new value of grad
   */
  private void setGrad (String newVar) {
    grad = newVar;
  }

  /**
   * Get the value of grad
   * @return the value of grad
   */
  private String getGrad () {
    return grad;
  }

  /**
   * Set the value of drzava
   * @param newVar the new value of drzava
   */
  private void setDrzava (String newVar) {
    drzava = newVar;
  }

  /**
   * Get the value of drzava
   * @return the value of drzava
   */
  private String getDrzava () {
    return drzava;
  }

  /**
   * Set the value of post_broj
   * @param newVar the new value of post_broj
   */
  private void setPost_broj (int newVar) {
    post_broj = newVar;
  }

  /**
   * Get the value of post_broj
   * @return the value of post_broj
   */
  private int getPost_broj () {
    return post_broj;
  }

  /**
   * Set the value of naziv_prostora
   * @param newVar the new value of naziv_prostora
   */
  private void setNaziv_prostora (String newVar) {
    naziv_prostora = newVar;
  }

  /**
   * Get the value of naziv_prostora
   * @return the value of naziv_prostora
   */
  private String getNaziv_prostora () {
    return naziv_prostora;
  }

  //
  // Other methods
  //

  /**
   */
  public void prikaz_lokacija()
  {
  }


}
