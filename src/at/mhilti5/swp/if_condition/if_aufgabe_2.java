package at.mhilti5.swp.if_condition;

import java.util.Random;

public class if_aufgabe_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber1 = random.nextInt(100);
        int randomnumber2 = random.nextInt(100);

        System.out.println(randomnumber1);
        System.out.println(randomnumber2);

        if (randomnumber1 < randomnumber2 && randomnumber1 < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        } else if (randomnumber1 < 30 || randomnumber2 < 30) {
            System.out.println("Eine der beiden Zahlen ist kleiner als 30");
        } else if (randomnumber1 < 50 && randomnumber2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}
