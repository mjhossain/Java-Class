package topics;

import java.util.Scanner;

public class SecondOrder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = userInput.nextDouble();

        System.out.print("Enter value of b: ");
        double b = userInput.nextDouble();

        System.out.print("Enter value of c: ");
        double c = userInput.nextDouble();

        if(a == 0) {
            System.out.println("The Solution of this equation is: " + (-c/b));
            System.exit(1);
        } else {
            double discriminant = (b*b) - (4*a*c);
            if(discriminant == 0) {
                System.out.println("The solution is: " + (-b / (2*a)));
            } else if (discriminant > 0) {
                double answerOne = (-b + Math.sqrt(discriminant)) / (2*a);
                double answerTwo = (-b - Math.sqrt(discriminant)) / (2*a);
                System.out.println("The solutions are: \n" + "Solution 1: " + answerOne + "\nSolution 2: " + answerTwo);
            } else {
                System.out.println("No real solutions!");
            }
        }
    }
}
