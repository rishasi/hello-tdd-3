package io.rishabh.app.calculator2;

public class Add extends Command{
    int counter = 0;

    public boolean appliesTo(String operation){
        return operation.equals("add");
    }

    public String execute(String[] values){
        int sum = 0;

        if(values[0].startsWith("log")){
            return Integer.toString(counter);
        }

        for(String value : values){
            sum = sum + Integer.parseInt(value);
        }
        counter++;
        return Integer.toString(sum);
    }
}
