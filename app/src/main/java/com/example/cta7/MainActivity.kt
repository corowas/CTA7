package com.example.cta7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerFrom: Spinner = findViewById(R.id.spinner_from)
        val spinnerTo: Spinner = findViewById(R.id.spinner_to)
        val inputText: TextView = findViewById(R.id.input_text)
        val resultText: TextView = findViewById(R.id.result_text)

        // Populate spinners with units
        val units = listOf("Celsius", "Fahrenheit")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFrom.adapter = adapter
        spinnerTo.adapter = adapter

        // Set default selection
        spinnerFrom.setSelection(0)
        spinnerTo.setSelection(1)

        // Set up conversion
        val converter = TemperatureConverter()

        inputText.setOnKeyListener { _, _, _ ->
            val inputValue = inputText.text.toString().toDoubleOrNull()
            if (inputValue != null) {
                val fromUnit = spinnerFrom.selectedItem.toString()
                val toUnit = spinnerTo.selectedItem.toString()
                val result = converter.convert(inputValue, fromUnit, toUnit)
                resultText.text = result.toString()
            }
            false
        }
    }
}
