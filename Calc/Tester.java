package Calc;

public class Tester {
    public static void main(String[] args) {
        Calc calcOne = new Calc();
        Calc calcTwo = new Calc();
        Calc calcThree = new Calc();

        // Setting up CalcOne
        calcOne.setX(10);
        calcOne.setY(5);

        // Setting up CalcTwo
        calcTwo.setX(10);
        calcTwo.setY(5);

        // Setting up CalcThree
        calcThree.setX(6);
        calcThree.setY(7);

        System.out.println("Addition: " +calcOne.sum());
        System.out.println("Subtraction: " +calcOne.diff());
        System.out.println("Multiplication: " +calcOne.mult());
        System.out.println("Division: " +calcOne.div());
        System.out.println("Modulo: " +calcOne.mod());

        System.out.println(calcOne);

        System.out.println(calcOne.equals(calcTwo));
    }
}
