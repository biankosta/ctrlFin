package com.lohanna.ctrlfin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by Lohanna on 10-Aug-18.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btSend;
    EditText edtLogin, edtPassword;
    CheckBox cbRemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btSend = (Button) findViewById(R.id.btSend);
        edtLogin = (EditText) findViewById(R.id.edtLogin);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        cbRemember = (CheckBox) findViewById(R.id.cbRemember);

        btSend.setOnClickListener(this);
    }


    public void onClick(View v) {
        if(v == btSend){

            if(cbRemember.isChecked()){

            }

            Intent intent = new Intent(v.getContext(), MainActivity.class);
            startActivity(intent);

        }
    }

}
