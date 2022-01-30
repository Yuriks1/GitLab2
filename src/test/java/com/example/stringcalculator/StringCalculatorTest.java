package com.example.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

        var result = stringCalculator.add("1,2,3,4,5,6");
        assertEquals(21, result);

    }

    @Test
    void addTestToAllowLinesBetweenNumbers() {

        var result = stringCalculator.add("1,2,3\n4,5");
        assertEquals(15, result);
    }

    @Test
    void addTestForDifferentDelimiters() {

        var result = stringCalculator.add("//;n1;2;3;4");
        assertEquals(10, result);
    }

    @Test
    void addTestToShowExceptionMessage() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> stringCalculator.add("-1"));
        assertEquals("negatives not allowed\n -1", exception.getMessage());

    }

    @Test
    void addTestToIgnoreNumbersOverThousand() {

        var result = stringCalculator.add("2,1001");
        assertEquals(2, result);
    }

    @Test
    void addTestToShowDelimiterCanBeOfAnyLength() {

        var result = stringCalculator.add("//[***]\n1***2***3");
        assertEquals(6, result);
    }

    @Test
    void allowForMultipleDelimiters() {

        var result = stringCalculator.add("//[*][%]\n1*2%3%4%%5");
        assertEquals(15, result);
    }
    @Test
    void allowForMultipleDelimitersOfAnyLength() {

        var result = stringCalculator.add("//[***][%%%]\n1***2%%%5");
        assertEquals( 8,result);
    }
}