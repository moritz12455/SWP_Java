package at.mhilti5.swp.bankgui;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Namen des Kontoinhabers ein: ");
        String owner = scanner.nextLine();

        System.out.print("Geben Sie den Anfangsbetrag ein: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(owner, initialBalance);
        BankMenu menu = new BankMenu(account);
        menu.start();
    }
}

