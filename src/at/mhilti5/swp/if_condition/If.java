package at.mhilti5.swp.if_condition;

import java.util.Random;

public class If {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println(randomNumber);

        if (randomNumber < 20){
            System.out.println("Mini");
        } else if (randomNumber >= 20 && randomNumber <= 50) {
            System.out.println("Medium");
        } else if (randomNumber > 50) {
            System.out.println("Large");
        }
    }
}
// start