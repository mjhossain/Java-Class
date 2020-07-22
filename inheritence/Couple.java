package inheritence;

/*Design a class that has two private integer members.
 * - default constructor and a constructor with two integers
 * - getters and setters
 * - Method sum that return the sum of the two integers.
 * - Method product that return the product of the two integers
 * - toString()
 * - equals that accepts an object couple and compares the two.
 *
 * ------Inheritance
 * Derive a class Triple that has three integers and does all the couple does (getters, setters, sum, product, toString  )
 * - Use inheritance (Triple inherites from couple.)
 * - default constructor and a constructor with three integers
 *
 * Test the triple class.
 *
 */
public class Couple {
    private int x, y;

    public Couple() {
        this.x = 0;
        this.y = 0;
    }

    public Couple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Sum
    public int sum() {
        return this.x + this.y;
    }

    public int product() {
        return this.x * this.y;
    }

    // toString()
    @Override
    public String toString() {
        return "Couple{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean equals(Couple obj) {
        if(this.x == obj.x && this.y == obj.y) {
            return true;
        } else {
            return false;
        }
    }

}
