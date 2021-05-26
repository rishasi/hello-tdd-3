package io.rishabh.app.calculator2;

public class CalculatorApp {

    Add add = new Add();
    Subtract sub = new Subtract();
    Multiply mul = new Multiply();

    public String execute(String command) {

        int sum = 0;
        int product = 1;
        String[] input = command.split(" ");
        String operation = input[0];
        String[] values = input[1].split(",");

        if(add.appliesTo(operation)){
            return add.execute(values);
        }

        if(sub.appliesTo(operation)){
            return sub.execute(values);
        }

        if(mul.appliesTo(operation)){
            return mul.execute(values);
        }
        return "Invalid command";
    }
}
