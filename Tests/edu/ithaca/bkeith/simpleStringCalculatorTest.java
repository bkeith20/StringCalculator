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
        nums = "2";
        sum = myCalc.Add(nums);
        assertEquals(2,sum);

        nums = "-2";
        sum = myCalc.Add(nums);
        assertEquals(-2,sum);

        nums = "100";
        sum = myCalc.Add(nums);
        assertEquals(100,sum);

        //two numbers: positive, negative, numbers of more than one digit
        nums = "2,3";
        sum = myCalc.Add(nums);
        assertEquals(5,sum);

        nums = "-2,-4";
        sum = myCalc.Add(nums);
        assertEquals(-6,sum);

        nums = "100,-1";
        sum = myCalc.Add(nums);
        assertEquals(99,sum);

        //more than two numbers

    }
}