package org.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
    StringCalculator calculator;

    @Before
    public void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    public void shouldReturnZeroWhenEmptyStringGiven() {
        String result = calculator.add("");
        assertThat(result).isEqualTo("0");
    }

    @Test
    public void shouldReturnThatNumberWhenSingleNumberGiven() {
        String result = calculator.add("1");
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void shouldReturnSumWhenTwoNumbersGiven() {
        String result = calculator.add("1.1,2.2");
        assertThat(result).isEqualTo("3.3");
    }

    @Test
    public void shouldReturnSumWhenThreeNumbersGiven() {
        String result = calculator.add("1.1,2.2,5");
        assertThat(result).isEqualTo("8.3");
    }
}
