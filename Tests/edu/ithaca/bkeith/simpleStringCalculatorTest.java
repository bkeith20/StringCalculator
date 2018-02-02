package edu.ithaca.bkeith;

import static org.junit.Assert.*;

public class simpleStringCalculatorTest {

    @org.junit.Test
    public void AddTest() {
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
        nums = "10,-3,15,-100,57,8";
        sum = myCalc.Add(nums);
        assertEquals(-13,sum);


        //Separated by new lines
        nums = "100\n-1";
        sum = myCalc.Add(nums);
        assertEquals(99,sum);

        nums = "10\n-3\n15\n-100\n57\n8";
        sum = myCalc.Add(nums);
        assertEquals(-13,sum);


    }
}