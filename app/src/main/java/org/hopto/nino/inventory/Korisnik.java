package org.hopto.nino.inventory;

/**
 * Class Korisnik
 */
public class Korisnik {

  //
  // Fields
  //

  public String username;
  private String password;
  private String ime;
  private String prezime;
  private String email;
  private int broj_telefona;
  
  //
  // Constructors
  //
  public Korisnik () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of username
   * @param newVar the new value of username
   */
  public void setUsername (String newVar) {
    username = newVar;
  }

  /**
   * Get the value of username
   * @return the value of username
   */
  public String getUsername () {
    return username;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  private void setPassword (String newVar) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  private String getPassword () {
    return password;
  }

  /**
   * Set the value of ime
   * @param newVar the new value of ime
   */
  private void setIme (String newVar) {
    ime = newVar;
  }

  /**
   * Get the value of ime
   * @return the value of ime
   */
  private String getIme () {
    return ime;
  }

  /**
   * Set the value of prezime
   * @param newVar the new value of prezime
   */
  private void setPrezime (String newVar) {
    prezime = newVar;
  }

  /**
   * Get the value of prezime
   * @return the value of prezime
   */
  private String getPrezime () {
    return prezime;
  }

  /**
   * Set the value of email
   * @param newVar the new value of email
   */
  private void setEmail (String newVar) {
    email = newVar;
  }

  /**
   * Get the value of email
   * @return the value of email
   */
  private String getEmail () {
    return email;
  }

  /**
   * Set the value of broj_telefona
   * @param newVar the new value of broj_telefona
   */
  private void setBroj_telefona (int newVar) {
    broj_telefona = newVar;
  }

  /**
   * Get the value of broj_telefona
   * @return the value of broj_telefona
   */
  private int getBroj_telefona () {
    return broj_telefona;
  }

  //
  // Other methods
  //

  /**
   */
  public void prikaz_kor()
  {
  }


}
