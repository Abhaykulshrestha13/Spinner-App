package com.a13hay.spinnerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() ,AdapterView.OnItemSelectedListener{
    lateinit var spinner:Spinner
    var list = arrayOf("India","Japan","China","USA")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById(R.id.spinner)
        spinner.onItemSelectedListener = this
        var aa:ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list)
        aa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        spinner.adapter = aa
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Toast.makeText(this,list[p2],Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}