package edu.ithaca.bkeith;

import static org.junit.jupiter.api.Assertions.*;

class simpleStringCalculatorTest {

    @org.junit.jupiter.api.Test
    void AddTest() {
        simpleStringCalculator myCalc = new simpleStringCalculatorIMPL();
        //empty string (should return 0)
        String nums = "";
        int sum = myCalc.Add(nums);
        assertEquals(0,sum);
        //one number: positive, negative, numbers of more than one digit

        //two numbers: positive, negative, numbers of more than one digit

        //more than two numbers

    }
}