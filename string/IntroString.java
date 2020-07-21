package string;

public class IntroString {
    public static int[] extractDate(String st) {
        String date = st.trim();
        String[] dateArr = date.split("/");
        int[] dateIntArr = new int[3];
        if(dateArr.length != 3) {
            System.out.println("Invalid Input");
            return null;
        } else {
            try {
                dateIntArr[0] = Integer.parseInt(dateArr[0]);
                dateIntArr[1] = Integer.parseInt(dateArr[1]);
                dateIntArr[2] = Integer.parseInt(dateArr[2]);
                return dateIntArr;
            } catch (Exception e) {
                System.out.println("Invalid Input");
                System.out.println(e.getMessage());
                return null;
            }

        }
    }
    public static void main(String[] args) {
        int[] date = extractDate("12/24/1997   ");
        for (int d: date
             ) {
            System.out.println(d);
        }
    }
}
