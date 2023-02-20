package org.example.calculator;

import java.util.stream.Stream;

public class StringCalculator implements Calculator {

    public int add(String numbers) {
        return Stream.of(numbers.split(","))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
