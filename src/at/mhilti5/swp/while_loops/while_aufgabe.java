package at.mhilti5.swp.while_loops;

import java.util.Random;

public class while_aufgabe {
    public static void main(String[] args) {
        Random random = new Random();

        boolean isfinished = false;
        int counter = 0;

        while (!isfinished){
            int randomNumber = random.nextInt(31 - 11) + 11;
            System.out.println(randomNumber);
            counter += randomNumber;

            if (randomNumber == 25 || randomNumber == 15){
                System.out.println(counter);
                isfinished = true;
            }



        }
    }
}
