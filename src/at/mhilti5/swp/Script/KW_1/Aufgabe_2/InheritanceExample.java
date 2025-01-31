package at.mhilti5.swp.Script.KW_1.Aufgabe_2;
public class InheritanceExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.describe();
        System.out.println("Area of the circle: " + circle.area());

        Rectangle rectangle = new Rectangle(4.0, 5.0);
        rectangle.describe();
        System.out.println("Area of the rectangle: " + rectangle.area());

        rectangle.describe("A large blue rectangle.");
    }
}

