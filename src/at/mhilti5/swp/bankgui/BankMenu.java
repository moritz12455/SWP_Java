package at.mhilti5.swp.bankgui;

import java.util.Scanner;

class BankMenu {
    private Scanner scanner;
    private BankAccount account;

    public BankMenu(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("\nWählen Sie eine Option:");
            System.out.println("1 - Einzahlung");
            System.out.println("2 - Abhebung");
            System.out.println("3 - Kontostand anzeigen");
            System.out.println("4 - Banknamen ändern");
            System.out.println("5 - Banknamen anzeigen");
            System.out.println("6 - Beenden");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Geben Sie den Einzahlungsbetrag ein: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Geben Sie den Abhebungsbetrag ein: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    scanner.nextLine(); // Zeilenumbruch konsumieren
                    System.out.print("Geben Sie den neuen Banknamen ein: ");
                    String newBankName = scanner.nextLine();
                    BankAccount.changeBankName(newBankName);
                    break;
                case 5:
                    BankAccount.displayBankName();
                    break;
                case 6:
                    running = false;
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte erneut versuchen.");
            }
        }

        scanner.close();
    }
}
