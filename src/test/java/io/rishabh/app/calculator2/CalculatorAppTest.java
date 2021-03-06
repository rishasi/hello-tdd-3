package io.rishabh.app.calculator2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAppTest {

    private final Command[] allCommands = {new Add(), new Subtract(), new Multiply()};
    private final CalculatorApp app = new CalculatorApp(allCommands);

    @Test
    void shouldDetectInvalidCommand() {
        String command = "kill yourself";
        String actual = app.execute(command);
        String expected = "Invalid command";
        assertEquals(expected, actual);
    }

    @Test
    void shouldAddNumbers(){
        String command = "add 2,3,4,5";
        String expected = "14";
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

}
