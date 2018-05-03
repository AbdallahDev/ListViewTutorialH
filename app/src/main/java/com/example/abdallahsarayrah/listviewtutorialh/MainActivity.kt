package com.example.abdallahsarayrah.listviewtutorialh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = arrayOf("a", "b", "c")
        val adapter1 = ArrayAdapter(this, android.R.layout.simple_list_item_1, array)
        listView1.adapter = adapter1
    }
}
