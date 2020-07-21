package homework;

import java.io.File;
import java.util.Scanner;

public class HomeWorkFive {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Please Enter File Path: ");
        String filePath = userIn.nextLine();
        File file = new File(filePath);

        // Check if file exists
        if(!file.exists()) {
            System.out.println("Sorry file does not exist!");
            System.exit(1);
        } else {
            System.out.println("File Loaded!");
        }
    }
}
