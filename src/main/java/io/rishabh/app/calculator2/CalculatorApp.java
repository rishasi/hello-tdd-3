package io.rishabh.app.calculator2;

public class CalculatorApp {
    public String execute(String command) {

        Add add  =  new Add();
        Subtract sub = new Subtract();
        Multiply mul = new Multiply();

        int sum = 0;
        int product = 1;
        String[] input = command.split(" ");
        String operation = input[0];
        String[] values = input[1].split(",");

        if(operation.equals("add")){
            return add.execute(values);
        }

        if(operation.equals("sub")){
            return sub.execute(values);
        }

        if(operation.equals("mul")){
            return mul.execute(values);
        }
        return "Invalid command";
    }
}
