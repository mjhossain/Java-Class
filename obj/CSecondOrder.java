package obj;

public class CSecondOrder {

    private double a, b, c;

    public CSecondOrder(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void solve() {
        if(a == 0) {
            //if it is then display the solution as being -c/b and then quit
            if(b == 0 && c != 0) {
                System.out.println("There is no solution");
            }else if(b == 0 && c == 0) {
                System.out.println("Infinite number solutions, whatever x");
            }else if(b != 0 && c == 0) {
                System.out.println("One solution x = 0");
            }else {
                double x = -c/b;
                System.out.println("There is one solution: " + x);
            }
        } else {
            //Compute the discriminant (you need a variable for )
            double D = Math.pow(b, 2) - 4*a*c;
            if(D == 0) {
                //check if the discriminant is 0, then you have one double solution
                System.out.println("There is one double solution: " + -b/(2*a));
            }else if(D > 0) {
                double x1 = (-b + Math.sqrt(D))/(2*a);
                double x2 = (-b - Math.sqrt(D))/(2*a);
                //else if the discriminant is positive, then yu have two distinct solutions
                //compute them and display them
                System.out.println("There are two solutions: X1 = " + x1 + "  X2 = " + x2);
            }else {
                //else (which mean it is negative) just display a message saying no real solutions.
                System.out.println("There are no real solutions");
            }

        }
    }
}
