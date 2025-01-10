package at.mhilti5.swp.KW_1.Aufgabe_1;

public class Car extends Vehicle {
    private int numberOfDoors;

    public void honk(){
        System.out.println("The " + Brand + " car is honking!");
    }


    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
