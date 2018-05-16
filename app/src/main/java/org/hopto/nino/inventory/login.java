package org.hopto.nino.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

  Button btn_login;
  EditText et_username;
  EditText et_password;
  DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button) findViewById(R.id.btn_login);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password =  (EditText) findViewById(R.id.et_password);

        databaseHelper = new DatabaseHelper(login.this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isExist = databaseHelper.checkUserExist(et_username.getText().toString(), et_password.getText().toString());

                if (isExist){
                    Intent intent = new Intent(login.this, menu.class);
                    intent.putExtra ("username", et_username.getText().toString());
                    startActivity(intent);
                }else
                    et_password.setText(null);
                Toast.makeText(login.this, "Neuspješno logiranje. Krivi username ili password", Toast.LENGTH_SHORT).show();
            }
        });
   }


}
