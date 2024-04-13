package com.vishcustom.kotlinlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Practical_1 extends AppCompatActivity {

    ListView listview;
    String arr[] = {"vishakha","l","vish","Vishu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical1);

      listview = findViewById(R.id.listview);
        ArrayAdapter s = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listview.setAdapter(s);

    }

}