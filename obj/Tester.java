package obj;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        double a, b, c;
        //invite the user to input he three numbers
        System.out.println("Enter the coefficcients a, b, c: ");
        //read the three numbers
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        CSecondOrder test1 = new CSecondOrder(a, b, c);

        test1.solve();
    }
}
