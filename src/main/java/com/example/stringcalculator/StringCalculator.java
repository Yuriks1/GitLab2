package com.example.stringcalculator;

import java.util.ArrayList;

public class StringCalculator {
    public int add(String s) {
        int sum = 0;
        ArrayList<String> array = new ArrayList<String>();
        array.add(s);

        for (var element : array) {
            if (element.equals("")) {
                return 0;
            }
            else if (element.contains(",")) {
                var numbers = element.split(",");
                for (var number : numbers) {
                    sum += Double.parseDouble(number);
                }
            }
            else {
                sum += Double.parseDouble(element);
            }
        }
        return (int) sum;
    }
}