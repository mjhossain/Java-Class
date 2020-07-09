package topics;

import java.util.Scanner;
public class PracticeSelection {

    public static void main(String[] args) {
        int N = 0;
        double S, t;
        //read N and t from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an the value of N: ");
        if(sc.hasNextInt()) {
            N = sc.nextInt();
        }else {
            System.out.print("The value is not an int, please enter an int: ");
            sc.nextLine();//empty the buffer
            N = sc.nextInt();
        }
        System.out.print("Enter an the value of t: ");
        t = sc.nextDouble();
        if(N > 100) {
            //ask for the value of another variable Q
            double Q;
            System.out.print("Enter an the value of Q: ");
            Q = sc.nextDouble();
            //depending on the value of Q, we use a different formula
            if(Q > 0) {
                double Num = Math.pow(N,  3)*Math.pow(t,  2);
                double Den = Math.pow(Math.pow(t,  4) - Math.pow(Q, 3), 4);
                S = Math.pow( Num/Den , 1.0/3.0);
                System.out.println("The value of S is: " + S);

            }else {
                double Num = N*Math.pow(t,  4);
                double Den = Math.pow(-Math.pow(Q, 3)*Math.pow(N, 2), 1.0/4.0);
                S = Math.log(Num/Den);
                System.out.println("The value of S is: " + S);
            }

        }else {
            S = Math.sin(-N/Math.pow(Math.E, t));
            System.out.println("The value of S is: " + S);
        }

    }

}
