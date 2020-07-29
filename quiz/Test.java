package quiz;

public class Test {
    public static void main(String[] args) {
        Siwawa dogOne = new Siwawa("Long Hair", true, true, "High", "Grey", 6);
        Siwawa dogTwo = new Siwawa("Short Hair", true, false, "Low", "Brown", 12);
        Siwawa dogThree = new Siwawa("Long Hair", true, true, "High", "Grey", 6);

        System.out.println("----DOG One----");
        System.out.println(dogOne.toString());
        System.out.println("----DOG Two----");
        System.out.println(dogTwo.toString());
        System.out.println("----DOG Three----");
        System.out.println(dogThree.toString());

        System.out.println("--------Tests--------");

        if(dogOne.equals(dogTwo)) {
            System.out.println("Yes they are same!");
        } else {
            System.out.println("No");
        }

        if(dogOne.equals(dogThree)) {
            System.out.println("Yes they are same!");
        } else {
            System.out.println("No");
        }

    }
}
