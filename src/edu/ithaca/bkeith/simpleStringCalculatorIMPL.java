package edu.ithaca.bkeith;

public class simpleStringCalculatorIMPL implements simpleStringCalculator {

    @Override
    public int Add(String numbers) {
        if(numbers==""){
            return 0;
        }
        else{
            return Integer.parseInt(numbers);
        }
    }
}
