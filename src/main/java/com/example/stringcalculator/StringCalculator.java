package com.example.stringcalculator;

public class StringCalculator {

    public int add(String s) {

        String delimiter = ",|\n";
        String sortedNumbers = s;
        if (s.startsWith("//")) {
            int delimiterLocation = s.indexOf("//") + 2;
            delimiter = s.substring(delimiterLocation, delimiterLocation + 1);
            sortedNumbers = s.substring(s.indexOf("n") + 1);
        }
        return add(sortedNumbers, delimiter);
    }

    private static int add(final String s, final String delimiter) {

        int sum = 0;
        String[] sortedNumbersArray = s.split(delimiter);
        for (String number : sortedNumbersArray) {

            if (!number.trim().isEmpty()) {
                sum += Integer.parseInt(number.trim());
            } else {
                sum = 0;
            }
        }

        return sum;
    }
}
