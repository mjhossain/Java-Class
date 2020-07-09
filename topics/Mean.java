package topics;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int firstNum = 0;
        int posSum = 0;
        int negSum = 0;
        int posCount = 0;
        int negCount = 0;
        int count = 0;

        while(true) {
            System.out.print("Enter a  int Value: ");
            while(!sc.hasNextInt()) {
                System.out.print("The value is not a int, please enter a int: ");
                sc.nextLine();
            }
            num = sc.nextInt();

            if(count == 0) {
                firstNum = num;
            }

            if(num == firstNum) {
                count++;
            }

            if(num == 0) {
                break;
            } else if (num > 0) {
                posCount++;
                posSum += num;
            } else {
                negCount++;
                negSum += num;
            }
        }

        System.out.println("Number of Positive Inputs: " + posCount + " || " + "Sum of Positive Numbers: " + posSum);
        System.out.println("Number of Negative Inputs: " + negCount + " || " + "Sum of Negative Numbers: " + negSum);
        System.out.println("There are " + (count -1) + " values similar to the first value which is " + firstNum);

    }
}
