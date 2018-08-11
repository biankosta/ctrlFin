package com.lohanna.ctrlfin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lohanna on 11-Aug-18.
 */

public class MenuFActivity extends AppCompatActivity implements View.OnClickListener{

    Button btList, btRegister, btPending, btSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btList = (Button) findViewById(R.id.btList);
        btRegister = (Button) findViewById(R.id.btRegister);
        btPending = (Button) findViewById(R.id.btPending);
        btSettings = (Button) findViewById(R.id.btSettings);

        btList.setOnClickListener(this);
        btRegister.setOnClickListener(this);
        btPending.setOnClickListener(this);
        btSettings.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v == btList){

            Intent intent = new Intent(v.getContext(), MainActivity.class);
            startActivity(intent);

        }
        if(v == btRegister){

            Intent intent = new Intent(v.getContext(), MainActivity.class);
            startActivity(intent);

        }
        if(v == btPending){

            Intent intent = new Intent(v.getContext(), MainActivity.class);
            startActivity(intent);

        }
        if(v == btSettings){

            Intent intent = new Intent(v.getContext(), MainActivity.class);
            startActivity(intent);

        }
    }

}
