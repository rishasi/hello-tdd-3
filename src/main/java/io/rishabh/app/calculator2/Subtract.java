package io.rishabh.app.calculator2;

public class Subtract {
    int sum = 0;
    public String execute(String[] numbers){
        sum = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        return Integer.toString(sum);
    }
}
