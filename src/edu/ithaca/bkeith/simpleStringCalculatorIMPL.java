package edu.ithaca.bkeith;

import java.util.Arrays;
import java.util.List;

public class simpleStringCalculatorIMPL implements simpleStringCalculator {

    @Override
    public int Add(String numbers) {
        if(numbers==""){
            return 0;
        }
        else{
            String[] numarray = numbers.split(",");
            List<String> numlist = Arrays.asList(numarray);
            int sum = 0;
            for (int i = 0; i<numlist.size(); i++){
                sum = sum + Integer.parseInt(numlist.get(i));
            }
            return sum;
        }
    }
}
