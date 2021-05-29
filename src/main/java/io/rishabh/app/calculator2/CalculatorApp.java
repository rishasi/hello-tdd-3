package io.rishabh.app.calculator2;

import java.util.ArrayList;

public class CalculatorApp {
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public String execute(String command) {

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
