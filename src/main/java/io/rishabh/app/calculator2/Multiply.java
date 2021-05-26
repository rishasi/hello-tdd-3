package io.rishabh.app.calculator2;

public class Multiply extends Command{
    int product = 1;
    int counter = 0;

    public boolean appliesTo(String operation){
        return operation.equals("mul");
    }

    public String execute(String[] values){
        if(values[0].startsWith("log")){
            return Integer.toString(counter);
        }

        for(String number : values){
            product = product * Integer.parseInt(number);
        }
        counter++;
        return Integer.toString(product);
    }
}
