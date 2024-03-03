package com.example.cta7

import org.junit.Assert.assertEquals
import org.junit.Test

class TemperatureConverterTest {

    private val converter = TemperatureConverter()

    @Test
    fun testCelsiusToFahrenheitConversion() {
        val celsius = 0.0
        val expectedFahrenheit = 32.0
        val result = converter.convert(celsius, "Celsius", "Fahrenheit")
        assertEquals(expectedFahrenheit, result, 0.01) // Delta is used to allow for floating-point precision
    }

    @Test
    fun testFahrenheitToCelsiusConversion() {
        val fahrenheit = 32.0
        val expectedCelsius = 0.0
        val result = converter.convert(fahrenheit, "Fahrenheit", "Celsius")
        assertEquals(expectedCelsius, result, 0.01)
    }

    // Add more tests as needed for other conversions and edge cases
}
