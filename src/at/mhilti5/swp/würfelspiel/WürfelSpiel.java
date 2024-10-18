package at.mhilti5.swp.würfelspiel;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class WürfelSpiel {
    public static void main(String[] args) {
    boolean isFinished = false;
    boolean isFinished2 = false;
    int computerCounter = 0;
    int playerCounter = 0;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    while(!isFinished2){


        System.out.println("Wilkommen beim Würfelspiel");
        System.out.println("1. Spiel beginnen");
        System.out.println("2. Beenden");
        int option = scanner.nextInt();
        if(option == 1) {
            while (!isFinished)
                for (int i = 0; i <= 6; i++) {
                    System.out.println("----");
                    int randomnumber1 = random.nextInt(6) + 1;
                    System.out.println("ComputerNumber:" + randomnumber1);
                    computerCounter += randomnumber1;
                    System.out.println("ComputerCount:" + computerCounter);
                    int randomnumber2 = random.nextInt(6) + 1;
                    System.out.println("PlayerNumber:" + randomnumber2);
                    playerCounter += randomnumber2;
                    System.out.println("Player Count:" + playerCounter);
                    if (i == 6) {
                        isFinished = true;
                    }
                    if (playerCounter > computerCounter) {
                        System.out.println("Spieler gewinnt");
                    } else if (playerCounter == computerCounter) {
                        System.out.println("Unentschieden");
                    } else if (playerCounter < computerCounter) {
                        System.out.println("Computer gewinnt");

                    }
                }
        }else if (option == 2) {
            isFinished2 = true;
        } ;
        }


    }
    }

