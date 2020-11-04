package com.dmwm.myapplicationtd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt_txt_java,edt_txt_cs,edt_txt_python;
    Button btn_apply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt_txt_cs=(EditText) findViewById(R.id.edt_txt_cs);
        edt_txt_java=(EditText) findViewById(R.id.edt_txt_java);
        edt_txt_python=(EditText) findViewById(R.id.edt_txt_py);
        btn_apply=(Button) findViewById(R.id.buttonAplly);



        btn_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float note_java = Float.parseFloat(String.valueOf(edt_txt_java.getText()));
                float note_cs = Float.parseFloat(String.valueOf(edt_txt_cs.getText()));
                float note_py = Float.parseFloat(String.valueOf(edt_txt_python.getText()));
                float moyenne=(note_cs+note_java+note_py)/3;
                if (moyenne >= 10) {
                    Intent i = new Intent(getApplicationContext(),Succeeded.class );
                    i.putExtra("Mayenne",moyenne);
                    startActivity(i);

                }
                else
                {
                    Intent i = new Intent(getApplicationContext(),Failed.class );i.putExtra("Mayenne",moyenne);
                    startActivity(i);
                }
            }
        });
    }

}