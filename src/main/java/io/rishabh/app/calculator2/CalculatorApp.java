package io.rishabh.app.calculator2;

public class CalculatorApp {
    public String execute(String command) {

        int sum = 0;
        String[] input = command.split(" ");
        String operation = input[0];
        String[] values = input[1].split(",");

        if(operation.equals("add")){
            for(String value : values){
                sum = sum + Integer.parseInt(value);
            }
            return Integer.toString(sum);
        }


        return "Invalid command";

    }
}
