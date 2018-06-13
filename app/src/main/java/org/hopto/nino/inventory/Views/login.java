package org.hopto.nino.inventory.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.hopto.nino.inventory.Engines.LoginEngine;
import org.hopto.nino.inventory.Helpers.DatabaseHelper;
import org.hopto.nino.inventory.R;

public class login extends AppCompatActivity {

  Button btn_login;
  EditText et_username;
  EditText et_password;
  LoginEngine databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button) findViewById(R.id.btn_login);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password =  (EditText) findViewById(R.id.et_password);

        databaseHelper = new LoginEngine(login.this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isExist = databaseHelper.checkUserExist(et_username.getText().toString(), et_password.getText().toString());

                if (isExist){
                    Intent intent = new Intent(login.this, menu.class);
                    intent.putExtra ("username", et_username.getText().toString());
                    startActivity(intent);
                }else {
                    et_password.setText(null);
                    Toast.makeText(login.this, "Neuspješno logiranje. Krivi username ili password", Toast.LENGTH_SHORT).show();
                }
            }
        });
   }


}
