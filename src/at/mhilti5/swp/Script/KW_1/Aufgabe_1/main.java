package at.mhilti5.swp.Script.KW_1.Aufgabe_1;

public class main {
    public static void main(String[] args) {
        Car c1 = new Car("Porsche", 2);
        c1.startEngine();
        c1.honk();
        System.out.println(c1.getNumberOfDoors());
    }
}
