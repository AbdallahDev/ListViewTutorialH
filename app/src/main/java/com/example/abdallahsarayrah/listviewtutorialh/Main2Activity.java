package com.example.abdallahsarayrah.listviewtutorialh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String[] foods = {"a", "b", "c"};
        ListAdapter adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, foods);
        ListView listview1 = (ListView) findViewById(R.id.listView1);
        listview1.setAdapter(adapter1);
    }
}
