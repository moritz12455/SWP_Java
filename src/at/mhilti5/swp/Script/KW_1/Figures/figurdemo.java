package at.mhilti5.swp.Script.KW_1.Figures;

public class figurdemo {
    public static void main(String[] args) {
        Figur fig = new Figur(50.0, 50.0);
        System.out.println();
        Kreis kr = new Kreis(10.0, 10.0, 5.0);
        System.out.println("Abstand von (100, 100): " + kr.abstand(100.0, 100.0));
    }
}