package io.rishabh.app.calculator2;

public class CalculatorApp {
    private int numOfCommands = 0;
    private Command[] commands = new Command[10];

    public void addCommand(Command command){
        // what now ?
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
