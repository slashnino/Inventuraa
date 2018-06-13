package org.hopto.nino.inventory.Views;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import android.content.Intent;
import android.widget.Toast;

import org.hopto.nino.inventory.Engines.MenuEngine;
import org.hopto.nino.inventory.Entities.Lokacija;
import org.hopto.nino.inventory.Entities.Zaduzenje;
import org.hopto.nino.inventory.R;

public class menu extends AppCompatActivity implements OnClickListener {

    private Button scanBtn,bt_promjeni,bt_potvrdi;
    private TextView formatTxt, contentTxt, inv, lokacija, datum, korisnik, naziv;
    private MenuEngine menuEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        scanBtn = (Button) findViewById(R.id.scan_button);
        formatTxt = (TextView) findViewById(R.id.scan_format);
        contentTxt = (TextView) findViewById(R.id.scan_content);
        inv = (TextView) findViewById(R.id.tv_inv);
        lokacija = (TextView) findViewById(R.id.tv_lokacija);
        datum = (TextView) findViewById(R.id.tv_datum);
        korisnik = (TextView) findViewById(R.id.tv_korisnik);
        naziv = (TextView) findViewById(R.id.tv_naziv);
        bt_promjeni = (Button) findViewById(R.id.bt_promjeni);
        bt_potvrdi = (Button) findViewById(R.id.bt_potvrdi);


        scanBtn.setOnClickListener((View.OnClickListener) this);
        bt_potvrdi.setOnClickListener((View.OnClickListener) this);
        bt_promjeni.setOnClickListener((View.OnClickListener) this);

        menuEngine = new MenuEngine(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.scan_button) {
             IntentIntegrator scanIntegrator = new IntentIntegrator(this);
             scanIntegrator.initiateScan();
             //String scanContent = "155700";
            /*if (scanContent != null && !scanContent.isEmpty()) {
                Zaduzenje zad = menuEngine.GetZaduzenje(scanContent);
                // to do get data from db naziv, lokacija, korisnik
                inv.setText(scanContent);
                lokacija.setText(zad.getLokacija());
                korisnik.setText(zad.getKorisnik());
                naziv.setText(zad.getNaziv());
                datum.setText(zad.getDatum());*/
                // show data from db*/
            //}
        }
        if (v.getId() == R.id.bt_promjeni) {
            Intent intent = new Intent(menu.this, edit.class);
            intent.putExtra("INV_ID", inv.getText().toString());
            intent.putExtra("NAZIV", naziv.getText().toString());
            startActivity(intent);
        }
    }


    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        if (scanningResult != null) {
            String scanContent = scanningResult.getContents();
            String scanFormat = scanningResult.getFormatName();
            formatTxt.setText("FORMAT: " + scanFormat);
            contentTxt.setText("CONTENT: " + scanContent);

            if (scanContent != null && !scanContent.isEmpty()) {
                Zaduzenje zad = menuEngine.GetZaduzenje(scanContent);
                    // to do get data from db naziv, lokacija, korisnik
                    inv.setText(scanContent);
                    lokacija.setText(zad.getLokacija());
                    korisnik.setText(zad.getKorisnik());
                    naziv.setText(zad.getNaziv());
                    datum.setText(zad.getDatum());
                    // show data from db
                }

            } else {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "No scan data received!", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }
