package inheritence;

public class Tester {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);

        System.out.println("Circumference: " + c1.getCircumference());
        System.out.println("Area: " + c1.getSurface());
    }
}
