package com.example.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.widget.AppCompatSpinner
import com.example.currencyconverter.models.SpinnerModel
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var firstSpinner : AppCompatSpinner? = null
    var secondSpinner: AppCompatSpinner? = null
    private var flagArray : ArrayList<String>? = null
    var flagAdapter : ArrayAdapter<String>? =null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstSpinner = findViewById(R.id.first_spinner)
        secondSpinner = findViewById(R.id.second_spinner)
        flagArray = ArrayList()

        populateFlagArray()

        flagAdapter = ArrayAdapter(this@MainActivity,android.R.layout.simple_dropdown_item_1line,flagArray)
        firstSpinner?.adapter = flagAdapter
        secondSpinner?.adapter = flagAdapter


    }

    private fun populateFlagArray() {
        flagArray?.add("EUR")
        flagArray?.add("AUR")
//        val spinnerModel = SpinnerModel(R.drawable.ic_launcher_background,"EUR", R.drawable.ic_keyboard_arrow);
//        flagArray?.add(spinnerModel)
//
//        val spinnerModel2 = SpinnerModel(R.drawable.ic_launcher_foreground, "ARU", R.drawable.ic_keyboard_arrow)
//        flagArray?.add(spinnerModel2)
    }
}
