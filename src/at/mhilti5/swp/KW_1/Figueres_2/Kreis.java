package at.mhilti5.swp.KW_1.Figueres_2;

public class Kreis extends Figur {
    protected double radius = 50.0;

    public Kreis(double x, double y, double rad) {
        super(x, y);
        if (rad >= 0)
            radius = rad;
    }

    public Kreis() {}

    public double abstand(double x, double y) {
        return Math.sqrt(Math.pow(xpos+radius-x, 2) + Math.pow(ypos+radius-y, 2));
    }
    @Override
    public void wo() {
        super.wo();
        System.out.println("Unten rechts: (" + (xpos+2*radius) +
                ", " + (ypos+2*radius) + ")");
    }

}
