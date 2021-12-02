package ATM;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;
public class ATMTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test(expected = IllegalArgumentException.class)
    public void processInvalid() {
        ATM atm = new ATM();
        atm.process(126);
    }
    @Test
    public void processCorrect() {
        ATM atm = new ATM();
        System.setOut(new PrintStream(outputStreamCaptor));
        atm.process(125);
        assertEquals(outputStreamCaptor.toString().trim(), "Get 1 banknotes of 5 nominal.\nGet 0 banknotes of 10 nominal.\nGet 6 banknotes of 20 nominal.");
    }
}