package exception_practice;

public class Test {
    public static void main(String[] args) {
        try {
            Construction con1 = new Construction("Z Corp.", "State", 2048, 2020);


            Residential res1 = new Residential();
            res1.setType("Commercial");
            res1.setArea(2000);
            res1.setNumOfAppt(50);
            res1.setYear(2000);


            System.out.println(con1.toString());
            System.out.println(res1.toString());

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


    }
}
