package io.rishabh.app.calculator2;

public class Add extends Loggable{

    public boolean appliesTo(String operation){
        return operation.equals("add");
    }

    public String executeOperation(String[] values){
        int sum = 0;

        for(String value : values){
            sum = sum + Integer.parseInt(value);
        }
        return Integer.toString(sum);
    }
}
