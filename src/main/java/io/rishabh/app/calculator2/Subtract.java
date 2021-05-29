package io.rishabh.app.calculator2;

public class Subtract extends Command{
    int counter = 0;

    public boolean appliesTo(String operation){
        return operation.equals("sub");
    }

    public String execute(String[] values){
        int sum = 0;

        if(values[0].startsWith("log")){
            return Integer.toString(counter);
        }

        sum = Integer.parseInt(values[0]) - Integer.parseInt(values[1]);
        counter++;
        return Integer.toString(sum);
    }
}
