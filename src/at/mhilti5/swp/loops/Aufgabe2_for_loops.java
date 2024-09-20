package at.mhilti5.swp.loops;

public class Aufgabe2_for_loops {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 2; i < 1001 ; i += 2) {
            counter += i;
        }
        System.out.println(counter);
    }
}
