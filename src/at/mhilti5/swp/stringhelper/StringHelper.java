package at.mhilti5.swp.stringhelper;

import java.util.Arrays;
import java.util.Scanner;

public class StringHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Isfinished = false;
        while (!Isfinished) {
            System.out.println("Wilkommen beim Stringhelper, geben sie ihr Wort ein .");
            String word = scanner.nextLine();
            if (isPalindrome(word)) {
                System.out.println("Das Wort ist ein Palindrome");
            } else {
                System.out.println("Das Wort ist kein Palindrome");
            }
            int[] letterCount = countletters(word);
            for (int i = 0; i < letterCount.length; i++) {
                System.out.println((char) (i + 'A') + ": " + letterCount[i]);
            }
            char[] reversedstring = reverse(word);
            System.out.println(reversedstring);

            System.out.println(letterAmount(word));







            }
        }


    public static boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                return false;
            }
        }

        return true;
            }

    public static int[] countletters(String word) {
        int[] letterCount = new int[26];
        char[] charArray = word.toUpperCase().toCharArray();
        for (char c : charArray) {
            if (c >= 'A' && c <= 'Z') {
                letterCount[c - 'A']++;
            }
        }
        return letterCount;
    }

    public static char[] reverse(String word) {
        char[] charArray = word.toCharArray();
        char[] reversedArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }
        return reversedArray;
    }

    public static int letterAmount(String word) {
        char[] arrayAmount1 = word.toCharArray();
        int arrayAmount = word.length();
        return arrayAmount;
    }

}



