package topics;


import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0;

        System.out.print("Enter an the value of N: ");
        if (!sc.hasNextInt()) {
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.print("Enter an the value of N: ");
            }
        }
        N = sc.nextInt();

        System.out.println("N : " + N);
    }
}
