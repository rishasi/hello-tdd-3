package io.rishabh.app.calculator2;

public class CalculatorApp {
    private final Command[] commands;

    CalculatorApp(Command[] commands){
        this.commands = commands;
    }

    public String execute(String command) {

        int sum = 0;
        int product = 1;
        String[] input = command.split(" ");
        String operation = input[0];
        String[] values = input[1].split(",");

        for(Command myCommand : commands){
            if(myCommand.appliesTo(operation)){
                return myCommand.execute(values);
            }
        }
        return "Invalid command";
    }
}
