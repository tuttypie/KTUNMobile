package com.tutty.ktunmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button giris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        giris= (Button) findViewById(R.id.button);

        giris.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent dash= new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(dash);
                Toast.makeText(getApplicationContext(), "Hoşgeldiniz!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
