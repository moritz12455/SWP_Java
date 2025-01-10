package at.mhilti5.swp.KW_1.Aufgabe_1;

public class Vehicle {
    protected String Brand;

    protected void startEngine() {
        System.out.println("The engine of" + Brand + " is starting");
    }

    public Vehicle(String brand) {
        Brand = brand;
    }
}
