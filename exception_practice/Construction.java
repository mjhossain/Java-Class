package exception_practice;

/*Design a class Construction than has the following:
 * -Owner
 * -Area (throw an exception in case negative input
 * -Type of the construction Residential/commercial/state/... Throw an exception in case wrong type
 * - year built (<2020 and >500 otherwise throw an exception with specific code and message
 * - Default constructor
 * -Constructor that accepts all attributes
 * -setters and getters
 * -toString
 * -Tester for Construction (use try-catch blocks in main)
 *
 * -Derive a class Residential.
 * -Number apartments (throw exception if negative or more than 1000)
 * -Default constructor
 * -Constructor that accepts all attibutes
 * -setters ang getters
 * -toString()
 * -Test the Residential class.
 *
 *
 *
 */


public class Construction {
    private String owner, type;
    private double area;
    private int year;

    public Construction() {
        this.owner = "NA";
        this.type = "NA";
        this.area = 0;
        this.year = 2000;
    }

    public Construction(String owner, String type, double area, int year) throws MyException {
        if(!this.type.equals("Residential") || !this.type.equals("Commercial") || !this.type.equals("State")
        || this.area < 0 || this.year > 2020 || this.year < 500) {
            throw new MyException(10, "Invalid Data");
        } else {
            this.owner = owner;
            this.type = type;
            this.area = area;
            this.year = year;
        }
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setArea(double area) throws MyException {
        if(area < 0) {
            throw new MyException(2, "Area cannot be a negative value!");
        } else {
            this.area = area;
        }
    }

    public void setYear(int year) throws MyException {
        if(year < 500 || year > 2020) {
            throw new MyException(4, "Provide a valid year!");
        } else {
            this.year = year;
        }
    }

    public void setType(String type) throws MyException {
        if(!type.equals("Residential") || !type.equals("Commercial") || !type.equals("State")) {
            throw new MyException(3, "Provide a valid type!");
        } else {
            this.type = type;
        }
    }

    @Override
    public String toString() {
        return "Construction{" +
                "owner='" + owner + '\'' +
                ", type='" + type + '\'' +
                ", area=" + area +
                ", year=" + year +
                '}';
    }
}
