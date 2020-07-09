package Calc;

public class Calc {
    private int x, y;

    // Setters
    public void setX(int num) {
        this.x = num;
    }

    public void setY(int num) {
        this.y = num;
    }

    // Getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }


    // toString Method
    public String toString() {
        String st;

        st = "x: " + x + ", y: " + y;

        return st;
    }

    // Object Equal method
    public boolean equals(Calc obj) {
        if(this.x == obj.x && this.y == obj.y) {
            return true;
        } else {
            return false;
        }
    }



    // Sum of x & y
    public int sum() {
        return x+y;
    }

    public int diff() {
        return x - y;
    }

    public int mult() {
        return x * y;
    }

    public int div() {
        return x / y;
    }

    public int mod() {
        return x % y;
    }

}
