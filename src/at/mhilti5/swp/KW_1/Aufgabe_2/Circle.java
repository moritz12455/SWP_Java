package at.mhilti5.swp.KW_1.Aufgabe_2;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void describe() {
        System.out.println("This is a circle with radius " + radius + ".");
    }
}
