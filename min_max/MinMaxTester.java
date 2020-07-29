package min_max;

public class MinMaxTester {
    public static void main(String[] args) {

        // Creating 2 objects
        MinMax obj1 = new MinMax(10, 5);
        MinMax obj2 = new MinMax();

        // Printing out the objects
        System.out.println("Initial Output after creating 2 objects");
        System.out.println("Object 1: " + obj1.toString());
        System.out.println("Object 2: " + obj2.toString());
        System.out.println("-----------------------------------------\n");

        // Setting obj2 with some values
        try {
            obj2.setMin(20);
            obj2.setMin(15);
            obj2.setMax(5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // Printing out the objects
        System.out.println("Output after setting values for obj2");
        System.out.println("Object 1: " + obj1.toString());
        System.out.println("Object 2: " + obj2.toString());
        System.out.println("-----------------------------------------\n");

        // Check if obj1 is equal to obj2
        System.out.println("Is obj1 == obj2?\t(both have the max of 10 and min of 5)\n");
        if(obj1.equalsTo(obj2)) {
            System.out.println("Yes we are equal to one another!");
        } else {
            System.out.println("No we are not equal! :(");
        }
        System.out.println("-----------------------------------------\n");

        // Adding 10 to obj1
        obj1.add(10);
        System.out.println("Output after adding 10 to obj1");
        System.out.println("Object 1: " + obj1.toString());
        System.out.println("-----------------------------------------\n");

        // Multiplying obj2 by 2
        obj2.mult(2);
        System.out.println("Output after multiplying obj2 by 2");
        System.out.println("Object 2: " + obj2.toString());
        System.out.println("-----------------------------------------\n");

        // Creating obj3 as sum of obj1 & obj2
        MinMax obj3 = obj1.addTwoObj(obj2);
        System.out.println("Output obj3 as a sum of obj1 & obj2");
        System.out.println("Object 3: " + obj3.toString());
        System.out.println("-----------------------------------------\n");

    }
}
