package exception_practice;

public class Residential extends Construction {
    private int numOfAppt;

    public Residential() {
        super();
        try {
            this.setType("Residential");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        this.numOfAppt = 0;
    }

    public Residential(String owner, double area, int year, int numOfAppt) throws MyException {
        super(owner, "Residential", area, year);
        if(numOfAppt < 0 || numOfAppt > 1000) {
            throw new MyException(7, "Invalid number of Appartments");
        } else {
            this.numOfAppt = numOfAppt;
        }
    }

    // Setters

    public void setNumOfAppt(int numOfAppt) throws MyException {
        if(numOfAppt < 0 || numOfAppt > 1000) {
            throw new MyException(7, "Invalid number of Appartments");
        } else {
            this.numOfAppt = numOfAppt;
        }
    }

    // Getters

    public int getNumOfAppt() {
        return numOfAppt;
    }

    @Override
    public String toString() {
        return super.toString() + "Residential{" +
                "numOfAppt=" + numOfAppt +
                '}';
    }
}
