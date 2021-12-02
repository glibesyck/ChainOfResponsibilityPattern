package ATM;

import java.util.InputMismatchException;

public abstract class MainTray implements Tray{
    private Tray next;
    private final int BANKNOTE;

    public MainTray(int banknote) {
        BANKNOTE = banknote;
    }

    public void process(int amount) {
        int numBanknotes = amount / BANKNOTE;
        if (next != null) {
            next.process(amount - numBanknotes*BANKNOTE);
        } else {
            if (amount - numBanknotes*BANKNOTE != 0) {
                throw new IllegalArgumentException("Sorry, it's impossible to process your request!");
            }
        }
        System.out.println("Get " + numBanknotes + " banknotes of " + BANKNOTE + " nominal.");
    }
    public void setNext(Tray tray) {
        this.next = tray;
    }
}
