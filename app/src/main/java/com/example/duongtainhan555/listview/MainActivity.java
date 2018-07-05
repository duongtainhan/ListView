package com.example.duongtainhan555.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<String> arrayName;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= findViewById(R.id.lv);
        arrayName = new ArrayList<>();
        arrayName.add("Nguyen Van A");
        arrayName.add("Nguyen Van B");
        arrayName.add("Nguyen Van C");
        arrayName.add("Nguyen Van D");
        arrayName.add("Nguyen Van E");
        arrayName.add("Nguyen Van F");
        //
        arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayName);
        lv.setAdapter(arrayAdapter);
    }
}
