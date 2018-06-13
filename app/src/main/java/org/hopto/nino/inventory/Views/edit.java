package org.hopto.nino.inventory.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;
import android.widget.Spinner;

import org.hopto.nino.inventory.Engines.EditEngine;
import org.hopto.nino.inventory.R;

public class edit extends AppCompatActivity implements OnClickListener {

   private EditEngine editEngine;
   private EditText et_inv, et_naziv;
   private Spinner s_lokacija, s_korisnik;
   private Button bt_spremi, bt_odustani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        editEngine = new EditEngine(this);

        et_inv = (EditText) findViewById(R.id.et_inv)  ;
        et_naziv = (EditText) findViewById(R.id.et_naziv);
        s_lokacija = (Spinner) findViewById(R.id.s_lokacija);
        s_korisnik = (Spinner) findViewById(R.id.s_korisnik);
        bt_spremi = (Button) findViewById(R.id.bt_spremi);
        bt_odustani = (Button) findViewById(R.id.bt_odustani);
        bt_spremi.setOnClickListener((View.OnClickListener) this);
        bt_odustani.setOnClickListener((View.OnClickListener) this);

        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            et_inv= null;
            et_naziv=null;
        }
        else
        {
            et_inv.setText(extras.getString("INV_ID"));
            et_naziv.setText(extras.getString("NAZIV"));
        }


        GetLists();

    }

    private  void  GetLists() {

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_lokacija.setAdapter(adapter);

        adapter.addAll(editEngine.GetNazivProstora());
        s_lokacija.setSelection(3);
        ArrayAdapter kor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        kor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_korisnik.setAdapter(kor);

        kor.addAll(editEngine.GetKorisnici());
    }

    public void onClick(View v) {
        if (v.getId() == R.id.bt_spremi) {
            editEngine.AzurirajInventar(et_inv.getText().toString(), s_korisnik.getSelectedItem().toString(), s_lokacija.getSelectedItem().toString());
        }
        Intent intent = new Intent(edit.this, menu.class);
        startActivity(intent);
    }
}
