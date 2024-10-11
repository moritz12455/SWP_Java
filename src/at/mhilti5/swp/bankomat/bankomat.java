package at.mhilti5.swp.bankomat;

import java.util.Scanner;

public class bankomat {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int kontostand = 0;
        boolean isFinished = false;
        while(!isFinished) {
            System.out.println("Selektieren sie die gewünschte Funktion");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Ende");
            int option = scanner.nextInt();
            if (option == 1) {
                System.out.println("Geben sie denn Betrag ein denn sie einzahlen möchten");
                int einzahlBetrag = scanner.nextInt();
                kontostand += einzahlBetrag;
                System.out.println("Sie haben " + einzahlBetrag + "$ eingezahlt");
            } else if (option == 2) {
                System.out.println("Geben sie denn Betrag ein denn sie auszahlen möchten");
                int auszahlBetrag = scanner.nextInt();
                kontostand -= auszahlBetrag;
                System.out.println("Sie haben " + auszahlBetrag + "$ ausgezahlt");
            } else if (option == 3) {
                System.out.println("Ihr Kontostand beträgt " + kontostand + "$");
            } else if (option == 4) {
                isFinished = true;
            }
        }
    }





    }

