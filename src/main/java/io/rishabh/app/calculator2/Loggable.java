package io.rishabh.app.calculator2;

public abstract class Loggable implements Command {

    int counter = 0;

    Loggable(){
        //System.out.println("Something");
    }

    @Override
    public String execute(String[] values) {

        if(values[0].startsWith("log")){
            return Integer.toString(counter);
        }
        counter++;
        return executeOperation(values);
    }

    public abstract String executeOperation(String[] values);
}
