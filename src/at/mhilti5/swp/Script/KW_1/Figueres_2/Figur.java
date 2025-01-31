package at.mhilti5.swp.Script.KW_1.Figueres_2;

public class Figur {
    protected double xpos = 100.0, ypos = 100.0;
    public Figur(double x, double y) {
        if (x >= 0 && y >= 0) {
            xpos = x;
            ypos = y;
        }
    }
    public Figur() {}
    public void wo() {
        System.out.println("\nOben links: (" + xpos + ", " + ypos + ") ");
    }

}
