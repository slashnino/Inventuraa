package org.hopto.nino.inventory.Entities;

import java.util.Date;

public class Zaduzenje {
    private  int inventarId;
    private  String naziv;
    private  int lokacijaId;
    private  String lokacija;
    private  String korisnik;
    private String datum;

    public int getInventarId() {
        return inventarId;
    }

    public void setInventarId(int inventarId) {
        this.inventarId = inventarId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getLokacijaId() {
        return lokacijaId;
    }

    public void setLokacijaId(int lokacijaId) {
        this.lokacijaId = lokacijaId;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
}
