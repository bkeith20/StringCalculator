package edu.ithaca.bkeith;

import java.util.Arrays;
import java.util.List;

public class simpleStringCalculatorIMPL implements simpleStringCalculator {

    @Override
    public int Add(String numbers) {
        if(numbers==""){
            return 0;
        }
        else {
            String[] numarray = numbers.split(",");

            try {
                List<String> numlist = Arrays.asList(numarray);
                int sum = 0;
                for (int i = 0; i < numlist.size(); i++) {
                    sum = sum + Integer.parseInt(numlist.get(i));
                }
                return sum;
            }
            catch (NumberFormatException e) {}
            numarray = numbers.split("\n");
            try {
                int sum = 0;
                for (int i = 0; i < numarray.length; i++) {
                    sum = sum + Integer.parseInt(numarray[i]);
                }
                return sum;
            }
            catch (NumberFormatException e) {}

            //String was not in correct format when separated by commas or new lines
            return 0;

        }
    }
}
