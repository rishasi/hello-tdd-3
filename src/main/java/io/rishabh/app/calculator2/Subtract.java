package io.rishabh.app.calculator2;

public class Subtract {
    int sum = 0;
    int counter = 0;

    public boolean appliesTo(String operation){
        return operation.equals("sub");
    }

    public String execute(String[] values){
        if(values[0].startsWith("log")){
            return Integer.toString(counter);
        }

        sum = Integer.parseInt(values[0]) - Integer.parseInt(values[1]);
        counter++;
        return Integer.toString(sum);
    }
}
