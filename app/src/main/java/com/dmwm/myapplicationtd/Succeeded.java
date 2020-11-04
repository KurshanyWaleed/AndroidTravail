package com.dmwm.myapplicationtd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Succeeded extends AppCompatActivity {
    Button sms;
    TextView txt;
    String str="Felisitation vous avez la moyenne Vore moyenne est : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succeeded);
        sms=findViewById(R.id.buttonSMS);
        Intent i = getIntent();
        final float moy=i.getFloatExtra("moyenne",0);
        txt.setText(str+" "+moy);


        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(str+""+moy));
                startActivity(i);
            }
        });
    }
}