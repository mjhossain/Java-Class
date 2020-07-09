package topics;

import java.util.Scanner;

public class IntroSelection {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your input: ");

        if(userInput.hasNextInt()) {
            int val = userInput.nextInt();
            System.out.println(val);
        } else {
            System.out.println("typeMismatchException would have been thrown here");
        }
    }
}
