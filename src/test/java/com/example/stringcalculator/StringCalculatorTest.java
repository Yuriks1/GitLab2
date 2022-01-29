package com.example.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void addEmptyStringShouldReturnZero() {

        int result = stringCalculator.add("");
        assertThat(result).isZero();
    }
    @Test
    void addOneNumberShouldReturnOne() {

        int result = stringCalculator.add("1");

        assertThat(result).isEqualTo(1);
    }

    @Test
    void addTwoNumbersShouldReturnThree() {

        int result = stringCalculator.add("1,2");

        assertThat(result).isEqualTo(3);
    }
    @Test
    void addUnknownAmountOfNumbers() {

        StringCalculator stringCalculator = new StringCalculator();

        var result = stringCalculator.add("1,2,3,4,5,6");

        assertEquals(21, result);

    }

    @Test
    void allowLinesBetweenNumbers() {
        StringCalculator stringCalculator = new StringCalculator();

        var result = stringCalculator.add("1,2,3\n4,5");

        assertEquals(15, result);
    }

    @Test
    void addDifferentDelimiters() {

        StringCalculator stringCalculator = new StringCalculator();

        var result = stringCalculator.add("//;n1;2;3;4");

        assertEquals(10, result);
    }
}