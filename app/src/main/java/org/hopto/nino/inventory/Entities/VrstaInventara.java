package org.hopto.nino.inventory.Entities;

public class VrstaInventara {

        //
        // Fields
        //

        private int id;
        private String nazivVrste;

        //
        // Constructors
        //
        public VrstaInventara() {
        }

        ;

        //
        // Methods
        //


        //
        // Accessor methods
        //

        /**
         * Set the value of id
         *
         * @param newVar the new value of id
         */
        private void setId(int newVar) {
            id = newVar;
        }

        /**
         * Get the value of id
         *
         * @return the value of id
         */
        private int getId() {
            return id;
        }

        /**
         * Set the value of naziv_vrste
         *
         * @param newVar the new value of naziv_vrste
         */
        private void setNazivVrste(String newVar) {
            nazivVrste = newVar;
        }

        /**
         * Get the value of naziv_vrste
         *
         * @return the value of naziv_vrste
         */
        private String getNazivVrste() {
            return nazivVrste;
        }

        //
        // Other methods
        //

        /**
         */
        public void PrikazVrste() {
        }
    }
