package org.hopto.nino.inventory.Engines;

import android.content.Context;
import android.database.Cursor;

import org.hopto.nino.inventory.Entities.Zaduzenje;
import org.hopto.nino.inventory.Helpers.DatabaseHelper;

public class MenuEngine extends DatabaseHelper {

    public  MenuEngine(Context context)
    {
        super(context);
    }


    public Zaduzenje GetZaduzenje(String inventarId)
    {
        String sql = "select inventar.id, \n" +
                "      (korisnik.ime||' '||korisnik.prezime) AS korisnik,\n" +
                "      lokacija.id,\n" +
                "      lokacija.naziv_prostora,\n" +
                "      inventar.naziv, \n" +
                "      zaduzenja.datum \n" +
                "from zaduzenja, \n" +
                "     lokacija,\n" +
                "     inventar,\n" +
                "     korisnik\n" +
                " where inventar.lokacija = lokacija.id\n" +
                " and inventar.zaduzenja = zaduzenja.id and zaduzenja.korisnik = korisnik.username AND inventar.id =? ";
        Zaduzenje z = new Zaduzenje();
        db = openDatabase();
        Cursor cursor = db.rawQuery(sql, new String[]{inventarId});
        while(cursor.moveToNext())
        {
             z.setInventarId(cursor.getInt(0));
             z.setKorisnik(cursor.getString(1));
             z.setLokacijaId(cursor.getInt(2));
             z.setLokacija(cursor.getString(3));
             z.setNaziv(cursor.getString(4));
             z.setDatum(cursor.getString(5));
        }
        return  z;
    }


}
