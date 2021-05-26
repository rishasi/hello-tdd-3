package io.rishabh.app.calculator2;

public class Multiply {
    int product = 1;
    public String execute(String[] numbers){
        for(String number : numbers){
            product = product * Integer.parseInt(number);
        }
        return Integer.toString(product);
    }
}
