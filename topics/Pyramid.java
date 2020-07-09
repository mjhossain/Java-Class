package topics;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pSize = 0;

        System.out.print("Enter the height of the pyramid: ");
        while(!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Invalid value, enter a number: ");
        }

        pSize = sc.nextInt();

        int i = 1;
        while(i <= pSize){

            int j = pSize;
            while(j >= i) {
                System.out.print(" ");
                j--;
            }

            int k = 1;
            while (k <= (2*i) - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }

    }
}
