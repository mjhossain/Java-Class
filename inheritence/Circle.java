package inheritence;

public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    public Circle(Point p, double r) {
        this.center = p;
        this.radius = r;
    }


    // Setters
    public void setCenter(Point center) {
        this.center = center;
    }

    public void setX(double x) {
        this.center.setX(x);
    }

    public void setY(double y) {
        this.center.setY(y);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    // Getters
    public Point getCenter() {
        return this.center;
    }

    public double getX() {
        return this.center.getX();
    }

    public double getY() {
        return this.center.getY();
    }

    public double getRadius() {
        return this.radius;
    }


    // toString
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + this.center +
                ", radius=" + this.radius +
                '}';
    }

    // equals
    public boolean equals(Circle obj) {
        if(this.center.equals(obj.center) && this.radius == obj.radius) {
            return true;
        } else {
            return false;
        }
    }


    // Return circumference
    public double getCircumference() {
        return Math.PI * 2 * this.radius;
    }

    // Return Area/Surface
    public double getSurface() {
        return Math.PI * (this.radius * this.radius);
    }

}
