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
        int result = calculator.add("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnThatNumberWhenSingleNumberGiven() {
        int result = calculator.add("1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnSumWhenTwoNumbersGiven() {
        int result = calculator.add("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldReturnSumWhenThreeNumbersGiven() {
        int result = calculator.add("1,2,3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void shouldReturnSumWhenManyNumbersGiven() {
        int result = calculator.add("1,2,3,4,5");
        assertThat(result).isEqualTo(15);
    }
}
