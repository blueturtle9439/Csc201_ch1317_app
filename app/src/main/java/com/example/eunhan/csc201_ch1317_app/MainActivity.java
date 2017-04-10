package com.example.eunhan.csc201_ch1317_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1a;
    EditText num1b;
    EditText num2a;
    EditText num2b;
    Button btn;

    Complex num1, num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1a = (EditText)findViewById(R.id.num1a);
        num1b = (EditText)findViewById(R.id.num1b);
        num2a = (EditText)findViewById(R.id.num2a);
        num2b = (EditText)findViewById(R.id.num2b);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(num1a.getText().length() > 0 && num1b.getText().length() > 0 && num2a.getText().length() > 0 && num2b.getText().length() > 0){//빈값이 넘어올때의 처리

            num1 = new Complex(Double.parseDouble(num1a.getText().toString()), Double.parseDouble(num1b.getText().toString()));
            num2 = new Complex(Double.parseDouble(num2a.getText().toString()), Double.parseDouble(num2b.getText().toString()));

            Intent intent = new Intent(this, result.class);
            startActivity(intent);

        }

        else
            Toast.makeText(this, "please insert double value", Toast.LENGTH_SHORT).show();




    }
}
