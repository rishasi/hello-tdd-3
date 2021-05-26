package io.rishabh.app.calculator2;

public class CalculatorApp {
    public String execute(String command) {

        int sum = 0;
        int product = 1;
        String[] input = command.split(" ");
        String operation = input[0];
        String[] values = input[1].split(",");

        if(operation.equals("add")){
            for(String value : values){
                sum = sum + Integer.parseInt(value);
            }
            return Integer.toString(sum);
        }

        if(operation.equals("sub")){
            sum = Integer.parseInt(values[0]) - Integer.parseInt(values[1]);
            return Integer.toString(sum);
        }

        if(operation.equals("mul")){
            for(String value : values){
                product = product * Integer.parseInt(value);
            }
            return Integer.toString(product);
        }


        return "Invalid command";

    }
}
