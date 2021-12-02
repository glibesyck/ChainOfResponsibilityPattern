package ATM;

public class ATM {
    private Tray root;
    public ATM() {
        Tray tray20 = new Tray20();
        Tray tray10 = new Tray10();
        Tray tray5 = new Tray5();
        tray20.setNext(tray10);
        tray10.setNext(tray5);
        root = tray20;
    }
    public void process(int amount) {
        root.process(amount);
    }
}
