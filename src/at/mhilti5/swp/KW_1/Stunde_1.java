package at.mhilti5.swp.KW_1;
public class Stunde_1 {
    public class Figur {
        private double xpos = 100.0, ypos = 100.0;
        public Figur(double x, double y) {
            if (x >= 0 && y >= 0) {
                xpos = x;
                ypos = y;
            }
            System.out.println("Figur-Konstruktor");
        }
        public Figur() {
            System.out.println("Figur-Konstruktor");
        }
    }
    public class Kreis extends Figur {
        private double radius = 50.0;
        public Kreis(double x, double y, double rad) {
            super(x, y);
            if (rad >= 0)
                radius = rad;
            System.out.println("Kreis-Konstruktor");
        }
        public Kreis() {
            System.out.println("Kreis-Konstruktor");
        }
    }

}
