package final_review;

public class Tester {
    public static void main(String[] args) {
        try {
            Game gameOne = new Game("Red", "Green", 5, 2, 0, 0);
            Game gameTwo = new Game("Red", "Green", 5, 2, 0, 0);

            // ---------------------------------- Testing Game Classes -------------------------------

            // Doing some changes to the Game classes
            gameOne.teamOneScored(1);
            gameOne.teamTwoScored(2);

            System.out.println("\n\n------- Checking who is winning --------");
            gameOne.whoIsWinning();

            //Doing more changes to the Game classes
            gameOne.teamOneScored(1);

            System.out.println("\n\n------- Checking who is winning again --------");
            gameOne.whoIsWinning();

            //--------------------------------- Testing Soccer Game Classes --------------------------------

            SoccerGame s1 = new SoccerGame("Real Madrid", "Barcalona", "John Alveria", 0, 0, 0, 0);
            SoccerGame s2 = new SoccerGame("Chelsea", "Liverpool", "Andy Succhle", 0, 0, 0, 0);
            SoccerGame s3 = new SoccerGame("Chelsea", "Liverpool", "Andy Succhle", 0, 0, 0, 0);


            s1.teamOneScored(1);
            s1.teamTwoScored(1);
            s1.teamOneScored(3);
            s1.substituteTeamOne(2);
            s1.substituteTeamTwo(3);

            System.out.println("\n\n------- Checking who is winning --------");
            s1.whoIsWinning();

            System.out.println("\n\n------- Checking display --------");
            System.out.println(s1.display());


            System.out.println("\n\n------- Checking if s2 & s3 are same? (should be same) --------");
            if(s2.equals(s3)) {
                System.out.println("S2 is same as S3");
            } else {
                System.out.println("Not Same");
            }


        } catch (GameException e) {
            System.out.println(e.getMessage());
        }
    }
}
