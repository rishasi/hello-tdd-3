package io.rishabh.app.calculator2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAppTest {

    CalculatorApp app = new CalculatorApp();
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
}
