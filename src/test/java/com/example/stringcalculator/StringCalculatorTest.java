package com.example.stringcalculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void addEmptyStringShouldReturnZero() {

        int result = stringCalculator.add("");
        assertThat(result).isEqualTo(0);
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
}