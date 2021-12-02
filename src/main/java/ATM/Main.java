package ATM;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int amount = sc.nextInt();
        ATM atm = new ATM();
        atm.process(amount);
    }
}
