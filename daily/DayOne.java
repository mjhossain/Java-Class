package daily;

public class DayOne {

    public static void main(String[] args) {
        int numberOfStudents = 17;
        double money = 17.23;
        String myName = "Mohammed";
        char response = 'y';
        double USdept = 26249913960.25;
        double sizeOfElectron = 2.14e-15;
        boolean ans = true;

        // Subtracting 1 students
        numberOfStudents--;

        // 3 times money
        money += 3 * money;

        // Adding last name
        myName += " Hossain";

        // Print Int Part
        long USdeptInt = (int) USdept;

        System.out.println(
                "Number of Students: " + numberOfStudents +
                "\nMoney Moe Has? " + money +
                "\nName: " + myName +
                "\nResponse: " + response +
                "\nU.S Dept: " + USdeptInt +
                "\nSize of an Electron: " + sizeOfElectron +
                "\nMy Answer: " + ans
        );
    }

}

