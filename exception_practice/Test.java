package exception_practice;

public class Test {
    public static void main(String[] args) {
        try {
            Construction con1 = new Construction("Z Corp.", "State", 2048.75, 2020);
            Construction con2 = new Construction();
            con2.setArea(4000);
            con2.setOwner("FC Corp.");
            con2.setType("City");
            con2.setYear(2000);

            Residential res1 = new Residential();
            res1.setType("Commercial");
            res1.setArea(2000);
            res1.setNumOfAppt(50);
            res1.setYear(2000);


            con1.toString();
            con2.toString();
            res1.toString();  

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


    }
}
