package com.example.eunhan.csc201_ch1317_app;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class result extends AppCompatActivity {
    private ArrayList<String> listviewlist = new ArrayList<String>();
    ListView listview;
    ArrayAdapter<String> Adapter;

    Complex num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        listview = (ListView) findViewById(R.id.listview);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_main, null);

        EditText num1a = (EditText) view.findViewById(R.id.num1a);
        EditText num1b = (EditText) view.findViewById(R.id.num1b);
        EditText num2a = (EditText) view.findViewById(R.id.num2a);
        EditText num2b = (EditText) view.findViewById(R.id.num2b);

        num1 = new Complex(Double.parseDouble(num1a.getText().toString()), Double.parseDouble(num1b.getText().toString()));
        num2 = new Complex(Double.parseDouble(num2a.getText().toString()), Double.parseDouble(num2b.getText().toString()));

        intoview(num1.toString() + " + " + num2.toString() + " = " + num1.add(num2));
        intoview(num1.toString() + " - " + num2.toString() + " = " + num1.subtract(num2));
        intoview(num1.toString() + " * " + num2.toString() + " = " + num1.multiply(num2));
        intoview(num1.toString() + " / " + num2.toString() + " = " + num1.divide(num2));
        intoview("|" + num1.toString() + "|" + " = " + num1.abs());


    }

    private void intoview(String s) //print lists into chatroom tab
    {
        listviewlist.add(s);
        Adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listviewlist);
        listview.setAdapter(Adapter);
    }

}
