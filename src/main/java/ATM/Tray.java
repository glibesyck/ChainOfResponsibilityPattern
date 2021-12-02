package ATM;

public interface Tray {
    void process(int amount);
    void setNext(Tray tray);
}
