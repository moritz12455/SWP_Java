package at.mhilti5.swp.bankgui;

class BankAccount {
    private final String owner;
    private double balance;
    private static String bankName = "SIGMA BANK";

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Einzahlung erfolgreich. Neuer Kontostand: " + balance + " EUR");
        } else {
            System.out.println("Ungültiger Einzahlungsbetrag.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Abhebung erfolgreich. Neuer Kontostand: " + balance + " EUR");
        } else {
            System.out.println("Abhebung fehlgeschlagen. Unzureichendes Guthaben oder ungültiger Betrag.");
        }
    }

    public void displayBalance() {
        System.out.println("Kontoinhaber: " + owner);
        System.out.println("Aktueller Kontostand: " + balance + " EUR");
    }

    public static void changeBankName(String newName) {
        bankName = newName;
        System.out.println("Der Bankname wurde auf " + bankName + " geändert.");
    }

    public static void displayBankName() {
        System.out.println("Bankname: " + bankName);
    }
}
