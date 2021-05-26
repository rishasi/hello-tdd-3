package io.rishabh.app.calculator2;

public class Add {

    int sum = 0;
    int counter = 0;
    public String execute(String[] numbers){
        for(String value : numbers){
            sum = sum + Integer.parseInt(value);
        }
        return Integer.toString(sum);
    }
}
