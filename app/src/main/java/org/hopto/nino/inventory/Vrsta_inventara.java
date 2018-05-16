package org.hopto.nino.inventory;

/**
 * Class Vrsta_inventara
 */
public class Vrsta_inventara {

  //
  // Fields
  //

  private int id;
  private String naziv_vrste;
  
  //
  // Constructors
  //
  public Vrsta_inventara () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  private void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  private int getId () {
    return id;
  }

  /**
   * Set the value of naziv_vrste
   * @param newVar the new value of naziv_vrste
   */
  private void setNaziv_vrste (String newVar) {
    naziv_vrste = newVar;
  }

  /**
   * Get the value of naziv_vrste
   * @return the value of naziv_vrste
   */
  private String getNaziv_vrste () {
    return naziv_vrste;
  }

  //
  // Other methods
  //

  /**
   */
  public void prikaz_vrste()
  {
  }


}
