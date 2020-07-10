package pairs;

import even.Even;
import javafx.util.Pair;

/*Design and code a class of paris of even numbers. It has the following properties:
 * 1- two Even objects (use the class Even)
 * 2- default constructor, creates the even numbers to default numbers
 * 3- constructor that accepts two integers and creates the first to create the first Even object and the secodn for
 * the second Even object
 * 4- Constructor that accepts two Even objects ad assigns the first to the first member and the secodn to the second
 * 4- setters and getters
 * 5- toString returns the two Even numbers separated by a comma (use the toString() from Even class)
 * 6- equals accepts an object Pairs ad returns true of the two objects are the same and false if not. Use equals from Even class
 * 7- method add that accepts a Pairs object and returns an object Pairs that is the sum of the two Pairs objects, without modfying
 * any input object
 * 8- A tester where you test your class.
 *
 */
public class Pairs {
    private Even A, B;

    public Pairs() {
        this.A = new Even();
        this.B = new Even();
    }

    public Pairs(int num1, int num2) {
        this.A = new Even(num1);
        this.B = new Even(num2);
    }

    public Pairs(Even obj1, Even obj2) {
        this.A = obj1;
        this.B = obj2;
    }

    public void setA(int num) {
        this.A = new Even(num);
    }

    public void setB(int num) {
        this.B = new Even(num);
    }

    public int getA() {
        return this.A.getX();
    }

    public int getB() {
        return this.B.getX();
    }

    public String toString() {
        return "A: " + this.A.getX() + " B: " + this.B.getX();
    }

    public boolean equals(Pairs obj1) {
        if((this.A.getX() == obj1.A.getX()) && (this.B.getX() == obj1.B.getX())) {
            return true;
        } else {
            return false;
        }
    }

    public Pairs add(Pairs obj1) {
        Pairs C;
        C = new Pairs(new Even(this.A.getX() + obj1.A.getX()),new Even( this.B.getX() + obj1.B.getX()));
        return C;
    }

}
