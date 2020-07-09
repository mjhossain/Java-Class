package even;

public class Tester {
    public static void main(String[] args) {

        // Creating two Objects
        Even even1 = new Even(5);
//        Even even2 = new Even();
        Even even3 = new Even(3);

        even1.add(even3);

//        System.out.println("Even1: " + even1.toString());

        // Printing out the values
        System.out.println(even1.toString());
//        System.out.println(even2.toString());

        // Is even1 == even2 ?
//        System.out.println("First Test");
//        if(even1.equals(even2)) {
//            System.out.println("Yes, even1 is == even2");
//        } else {
//            System.out.println("No, even1 is != even2");
//        }
//
//        // Using a setter
//        even2.setX(even1.getX());
//
//        // Is even1 == even2 ?
//        System.out.println("Second Test");
//        if(even1.equals(even2)) {
//            System.out.println("Yes, even1 is == even2");
//        } else {
//            System.out.println("No, even1 is != even2");
//        }
    }
}
