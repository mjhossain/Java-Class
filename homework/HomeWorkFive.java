/*
Developer: Mohammed J Hossain
Github: @mjhossain
Website: www.modevelops.com
Date: Jul 20, 2020
Purpose: Class - Homework
 */

package homework;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HomeWorkFive {
    public static void main(String[] args) {

        // Scanner for getting file name from user
        Scanner userIn = new Scanner(System.in);

        // Ask for file path
        System.out.print("Please Enter File Path: ");
        String filePath = userIn.nextLine();

        // Open file
        File file = new File(filePath);

        // Check if file exists
        if(!file.exists()) {
            System.out.println("Sorry file does not exist!");
            System.exit(1);
        } else {
            System.out.println("File Loaded!");
        }

        // Perform actions on file
        try {

            // Creating the output file
            String newFileName = filePath.substring(0, filePath.length() - 4) + "_out.txt";
            FileWriter outputFile = new FileWriter(newFileName);

            // Reading existing file
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // A variable to store each line in the input file
            String line;
            while((line = bufferedReader.readLine()) != null) {

                // Scanner object for reading the lines
                Scanner fileInput = new Scanner(line);

                // Reading parts of line
                String first = fileInput.next();
                String last = fileInput.next();
                int m = fileInput.nextInt();
                double t = fileInput.nextDouble();

                // Write line to the output file
                outputFile.write("F: " + first + " L: " + last + " T: " + t + " M: " + m + "\n");
            }

            // Close all readers & writers
            bufferedReader.close();
            fileReader.close();
            outputFile.close();

            // Notify user that file write is complete
            System.out.println("File write complete!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
