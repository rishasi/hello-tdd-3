package io.rishabh.app.calculator2;

public class Multiply extends Loggable{

    public boolean appliesTo(String operation){
        return operation.equals("mul");
    }

    public String executeOperation(String[] values){
        int product = 1;

        for(String number : values){
            product = product * Integer.parseInt(number);
        }
        return Integer.toString(product);
    }
}
