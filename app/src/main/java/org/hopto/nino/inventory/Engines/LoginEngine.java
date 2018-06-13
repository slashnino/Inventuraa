package org.hopto.nino.inventory.Engines;

import android.content.Context;
import android.database.Cursor;

import org.hopto.nino.inventory.Helpers.DatabaseHelper;

public class LoginEngine extends DatabaseHelper {
    private final String USER_TABLE = "korisnik";

    public LoginEngine(Context context) {
        super(context);
    }

    public boolean checkUserExist(String username, String password) {
        String[] columns = {"username", "password"};
        db = openDatabase();

        String selection = "username = ? and password = ?";
        String[] selectionArgs = {username, password};

        Cursor cursor = db.query(USER_TABLE, columns, selection, selectionArgs, null, null, null);
        Cursor cur = db.query(USER_TABLE, columns, null, null, null, null, null);
        String test = "";
        while (cur.moveToNext()) {

            test += cur.getString(0);
        }
        int count = cursor.getCount();

        cursor.close();
        close();

        if (count > 0) {
            return true;
        } else {
            return false;

        }
    }
}
