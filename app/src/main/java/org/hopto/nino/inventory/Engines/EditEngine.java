package org.hopto.nino.inventory.Engines;

import android.content.Context;
import android.database.Cursor;
import android.widget.ArrayAdapter;

import org.hopto.nino.inventory.Helpers.DatabaseHelper;

import java.util.ArrayList;
import java.util.Calendar;

public class EditEngine extends DatabaseHelper {

    public EditEngine(Context context)
    {
        super(context);
    }

    public ArrayList<String> GetNazivProstora()
    {
        String sql = "SELECT naziv_prostora FROM  lokacija ORDER BY naziv_prostora";
        db =openDatabase();
        Cursor cur = db.rawQuery(sql, null);
        ArrayList<String> prostori = new ArrayList<String>();
        while (cur.moveToNext())
        {
            prostori.add(cur.getString(0));
        }
        return  prostori;
    }

    public ArrayList<String> GetKorisnici()
    {
        String sql = "SELECT username FROM korisnik ORDER BY username";
        db =openDatabase();
        Cursor cur = db.rawQuery(sql, null);
        ArrayList<String> korisnici = new ArrayList<String>();
        while (cur.moveToNext())
        {
            korisnici.add(cur.getString(0));
        }
        return  korisnici;
    }

    public void AzurirajInventar(String inventar, String korisnik, String nazivProstora)
    {
        String sqlInventar ="UPDATE inventar\n" +
                    "SET lokacija = (\n" +
                    "        SELECT id\n" +
                    "FROM lokacija\n" +
                    "WHERE naziv_prostora = ?\n" +
                    ")\n" +
                    "WHERE id = ?\n" ;
        String sqlZaduzenje =   "UPDATE zaduzenja\n" +
                                "SET korisnik = ?,\n" +
                                "datum = ?\n" +
                                "WHERE id = (\n" +
                                "        SELECT zaduzenja\n" +
                                "FROM inventar\n" +
                                "WHERE id = ?\n" +
                                "    )\n" ;

        db= openDatabase();
        try
        {
            db.beginTransaction();
            db.execSQL(sqlInventar, new Object[]{ nazivProstora, inventar});
            db.execSQL(sqlZaduzenje, new Object[]{ korisnik, Calendar.getInstance().getTime(), inventar});
            db.setTransactionSuccessful();
        }
        finally {
            db.endTransaction();
        }

    }
}
