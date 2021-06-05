package io.rishabh.app.calculator2;

public class Subtract extends Loggable{

    public boolean appliesTo(String operation){
        return operation.equals("sub");
    }

    public String executeOperation(String[] values){
        int sum = 0;

        sum = Integer.parseInt(values[0]) - Integer.parseInt(values[1]);
        return Integer.toString(sum);
    }
}
