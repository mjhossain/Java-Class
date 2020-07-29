package min_max;

public class MinMax {
    // * - two integer private members, min and max
    private int min, max;

    // * - default constructor sets both to 0
    public MinMax() {
        this.min = 0;
        this.max = 0;
    }

    // * - constructor that accepts two integers and sets max to the largest and min the smallest
    public MinMax(int num1, int num2) {
        if(num1 > num2) {
            this.max = num1;
            this.min = num2;
        } else {
            this.max = num2;
            this.min = num1;
        }
    }

    // * - setter that accepts two integers and sets max to the largest and min the smallest
    public void setMixMax(int num1, int num2) {
        if(num1 > num2) {
            this.max = num1;
            this.min = num2;
        } else {
            this.max = num2;
            this.min = num1;
        }
    }

    // * - getters for min and max
    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    /*
     * - setter for min, will set min to the input value if the input value is smaller than max. If however the
     * input value is larger than max then min should be set to the old max and the max to the input value
    */
    public void setMin(int num) throws MyException {
        if(num < this.max) {
            this.min = num;
        } else {
            MyException ex = new MyException(10, "Min cannot be larger than max.");
            throw ex;
        }
    }

    /*
     * - setter for max, will set max to input value if the input value is larger than min, otherwise (input is smaller than min)
     * - then the max should be set to the old min and min to the input value.
    */
    public void setMax(int num) throws MyException {
        if(num > this.min) {
            this.max = num;
        } else {
            MyException ex = new MyException(5, "Max cannot b smaller than min");
            throw ex;
        }
    }

    /*
     * - toString() to return the values of min and max as a string
    */
    public String toString() {
        return "Max: " + this.max + "\tMin: " + this.min;
    }

    /*
     * - equals that accepts another object MinMax return true if they equal and false if not
    */
    public boolean equalsTo(MinMax obj) {
        if((this.min == obj.min) && (this.max == obj.max)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * - method add that accepts an integer and adds the integer to both min and max
    */
    public void add(int num) {
        try {
            this.setMax(this.max + num);
            this.setMin(this.min + num);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }

    }

    /*
     * - method add that accepts another MinMax object and return a MinMax object that is the sum of this and the input object,
      without changing this object or the input object.
    */
    public MinMax addTwoObj(MinMax obj) {
        MinMax sumObj = new MinMax(this.min + obj.min, this.max + obj.max);
        return sumObj;
    }

    /*
     * - a method mult that accepts an integer and multiplies both min and max by the integer (be carefull, multiplying by
      a negative value changes min to max and max to min)
    */
    public void mult(int num) {
        if(num < 0) {
            int temp = this.max;
            this.max = this.min;
            this.min = temp;
        } else {
            this.min = this.min * num;
            this.max = this.max * num;
        }
    }

}
