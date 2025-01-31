package at.mhilti5.swp.Script.KW_1.Figures;

public class Kreis extends Figur {
    protected double radius = 50.0;
    public Kreis(double x, double y, double rad) {
        super(x, y);
        if (rad >= 0) {
            radius = rad;
        }
        System.out.println("Kreis-Konstruktor");
    }
    public Kreis() {
        System.out.println("Kreis-Konstruktor");
    }
    public double abstand(double x, double y) {
        return Math.sqrt(Math.pow(xpos + radius - x, 2) + Math.pow(ypos + radius - y, 2));
    }
}


