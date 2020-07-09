package topics;

import java.util.Scanner;

public class RandomEquation {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = uInput.nextInt();

        System.out.print("Enter T: ");
        int t = uInput.nextInt();


        if(n > 100) {
            System.out.println("Enter Q: ");
            double q = uInput.nextDouble();

            if(q > 0) {
                double s = Math.cbrt((Math.pow(n, 3) * Math.pow(t, 2))/(Math.pow((Math.pow(t, 4) - Math.pow(q, 3)),4)));
                System.out.println("S equals to: " + s);
            } else if (q < 0) {
                double s = Math.log((Math.pow(t,4) * n)/(Math.pow((-Math.pow(q,3) * Math.pow(n,2)),1/4)));
                System.out.println("S equals to: " + s);
            }

        } else {
            double s = Math.sin(-n/(Math.pow(Math.E, t)));
            System.out.println("S equals to: " + s);
        }
    }
}
