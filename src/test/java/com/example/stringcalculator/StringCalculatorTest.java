package com.example.stringcalculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

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
}