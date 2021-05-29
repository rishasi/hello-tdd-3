package io.rishabh.app.calculator2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAppTest {
    private CalculatorApp app;

    public CalculatorAppTest(){
        app = new CalculatorApp();
        app.addCommand(new Add());
        app.addCommand(new Subtract());
        app.addCommand(new Multiply());
    }

    @Test
    void shouldDetectInvalidCommand() {
        String command = "kill yourself";
        String actual = app.execute(command);
        String expected = "Invalid command";
        assertEquals(expected, actual);
    }

    @Test
    void shouldAddNumbers(){
        String command = "add 0,1,2,3";
        String expected = "6";
        String actual = app.execute(command);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSubtractTwoNumbers(){
        String command = "sub 2,3";
        String expected = "-1";
        String actual = app.execute(command);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMultiplyNumbers(){
        String command = "mul 2,3";
        String expected = "6";
        String actual = app.execute(command);
        assertEquals(expected, actual);
    }

    @Test
    void shouldTrackNumberOfExecutionOfMultiplyCommand(){
        app.execute("mul 2,3");
        app.execute("mul 2,5");
        app.execute("mul 2,6");

        String command = "mul log-count";
        String expected = "3";
        String actual = app.execute(command);
        assertEquals(expected, actual);
    }

    @Test
    void shouldTrackNumberOfExecutionOfAddCommand(){
        app.execute("add 2,3");
        app.execute("add 2,5");
        app.execute("add 2,6");
        app.execute("add 2,7");
        app.execute("add 2,9");

        String command = "add log-count";
        String expected = "5";
        String actual = app.execute(command);
        assertEquals(expected, actual);
    }

    @Test
    void shouldTrackNumberOfExecutionOfSubtractCommand(){
        app.execute("sub 2,3");
        app.execute("sub 2,5");

        String command = "sub log-count";
        String expected = "2";
        String actual = app.execute(command);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSupportAnyNumOfCommands(){
        for (int i = 0; i < 20; i++){
            app.addCommand(new Add());
        }
        String command = "add 0,1,2,3";
        String expected = "6";
        String actual = app.execute(command);
        assertEquals(expected, actual);
    }
}
