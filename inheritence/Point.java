/*
Date: July 10th, 2020
Developer: Mohammed Jakir Hossain
Class: MAC190 - Mid Term
GitHub: @mjhossain
Website: https://modevelops.com
Email: mjhossain@modevelops.com
*/

package inheritence;

public class Point {
    private double x, y;

    // Default Constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor (user defined values)
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    //toString()
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() +")";
    }

    // equals
    public boolean equals(Point p) {
        if((this.x == p.x) && (this.y == p.y)) {
            return true;
        } else {
            return false;
        }
    }

    // Distance
    public double getDistance(Point p) {
        double distance;
        distance = Math.hypot((this.x - p.x), (this.y - p.y));
        return distance;
    }



    /* End of File */
}
