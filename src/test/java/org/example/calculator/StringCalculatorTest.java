package org.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

// "" -> "0"
// "1" -> "1"
// "1.1,2.2" -> "3.3"

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroWhenEmptyStringGiven() {
        StringCalculator calculator = new StringCalculator();
        String result = calculator.add("");
        assertEquals("0", result);
    }

    @Test
    public void shouldReturnThatNumberWhenSingleNumberGiven() {
        StringCalculator calculator = new StringCalculator();
        String result = calculator.add("1");
        assertEquals("1", result);
    }

    @Test
    public void shouldReturnSumWhenTwoNumbersGiven() {
        StringCalculator calculator = new StringCalculator();
        String result = calculator.add("1.1,2.2");
        assertEquals("3.3", result);
    }

    @Test
    public void shouldReturnSumWhenThreeNumbersGiven() {
        StringCalculator calculator = new StringCalculator();
        String result = calculator.add("1.1,2.2,5");
        assertEquals("8.3", result);
    }

}
