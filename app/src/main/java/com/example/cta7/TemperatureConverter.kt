package com.example.cta7

class TemperatureConverter {
    fun convert(input: Double, fromUnit: String, toUnit: String): Double {
        return when {
            fromUnit == "Celsius" && toUnit == "Fahrenheit" -> celsiusToFahrenheit(input)
            fromUnit == "Fahrenheit" && toUnit == "Celsius" -> fahrenheitToCelsius(input)
            else -> input // No conversion needed
        }
    }

    private fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 9 / 5 + 32
    }

    private fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5 / 9
    }
}
