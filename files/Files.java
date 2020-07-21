package files;

/* We want to create a file and write three lines to it.
 * The file name will be an input from the user.
 *
 * Modify the program below have the following.
 * The user will type as many lines as he wishes and will stop by
 * writing a "." in an empty line. Example:
 * Please enter the file you want to create:
 *  C:\\dsdf\xdgdfgdr\dgdfg\letter.txt
 *
 * Please enter your text:
 * this is my text
 * I just write any bla bla that comes to mind
 * how about another line
 * is this enough or what?
 * .
 *
 * Now the file letter.txt should contain all the text I typed but the last .
 *
 *
 */
import java.util.Scanner;
import java.io.*;

public class Files {

    public static void main(String[] args) {
        //get the file name from the user
        Scanner sc = new Scanner(System.in);
        //get the file name
        System.out.println("Please enter the file name: ");
        String fileName = sc.nextLine();
        File f = new File(fileName);
        if(f.exists()) {
            System.out.println("The file exists but we will overwrite it");
        }else {
            System.out.println("The file does not exist we will create it");
        }
        try {
            FileWriter fr = new FileWriter(f);
            //need BufferedWriter
            BufferedWriter br = new BufferedWriter(fr);

            //close your files
            br.close();
        }catch(IOException e) {
            System.out.println("Exception: " + e.getMessage());
            System.exit(1);
        }
    }

}
