package io.rishabh.app.calculator2;

public class CalculatorApp {
    private int numOfCommands = 0;
    private Command[] commands = new Command[10];

    public void addCommand(Command command){
        if(numOfCommands == commands.length){
            int oldSize = commands.length;
            Command [] moreCommands = new Command[commands.length + 10];
            for(int i = 0; i < oldSize; i++){
                moreCommands[i] = commands[i];
            }
            commands = moreCommands;
        }
        commands[numOfCommands] = command;
        numOfCommands++;
    }

    public String execute(String command) {

        String[] input = command.split(" ");
        String operation = input[0];
        String[] values = input[1].split(",");

        for(int i = 0; i < numOfCommands; i++){
            if(commands[i].appliesTo(operation)){
                return commands[i].execute(values);
            }
        }
        return "Invalid command";
    }
}
