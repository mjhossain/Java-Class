package even;

public class Even {
    private int x;

    // Default Constructor
    public Even() {
        this.x = 0;
    }

    // User defined constructors
    public Even(int val) {
        if(val % 2 != 0) {
            this.x = val+1;
        } else {
            this.x = x;
        }
    }

    // Setter
    public void setX(int x) {
        if(x % 2 != 0) {
            this.x = x+1;
        } else {
            this.x = x;
        }
    }

    // Getter
    public int getX() {
        return this.x;
    }

    // toString()
    @Override
    public String toString() {
        String result;
        result = "The value of x: " + x;
        return result;
    }

    // Equals
    public boolean equals(Even obj) {
        if(this.x == obj.x) {
            return true;
        } else {
            return false;
        }
    }

    // Overloading
    public void add(int n) {
        this.setX(this.x + n);
    }

    // Add Object
    public void add(Even obj) {
        this.setX(this.x + obj.x);
    }

}
