package org.hopto.nino.inventory.Entities;
import java.sql.Date;


public class Zaduzenja
{    //   // Fields   //
    private int id;
    private Date datum;

    //   // Constructors   //
    public Zaduzenja () { }

//   // Methods   //     //
// Accessor methods   //

    /**    * Set the value of id    * @param newVar the new value of id    */
    private void setId (int newVar) {     id = newVar;   }
    /**    * Get the value of id    * @return the value of id    */
    private int getId () {     return id;   }
    /**    * Set the value of datum    * @param newVar the new value of datum    */
    private void setDatum (Date newVar) {     datum = newVar;   }
    /**    * Get the value of datum    * @return the value of datum    */
    private Date getDatum () {     return datum;   }

//   // Other methods   //
    /**    */
    public void zaduzhi()   {   }

    /**    */   public void PrikazZad()   {   }
    /**    */   public void Preseli()   {   }
}