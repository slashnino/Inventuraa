package org.hopto.nino.inventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    TextView hyuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        hyuser = (TextView) findViewById(R.id.hyuser);

        Bundle extras = getIntent().getExtras();
        String username = null;
        if(extras != null){
            username = extras.getString("username");
            hyuser.setText(null);
            }
    }
}
