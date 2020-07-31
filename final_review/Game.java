/*
Developer: Mohammed J Hossain
GitHub: @mjhossain
Date: July 30th, 2020
Purpose: MAC190 - Final Review
 */


package final_review;

public class Game {
    private String teamOne, teamTwo;
    private int numOfPlayers, numOfSubstitutes;
    int teamOneScore, teamTwoScore;

    // Default Constructor
    public Game() {
        this.teamOne = "Unknown";
        this.teamTwo = "Unknown";
        this.numOfPlayers = 0;
        this.numOfSubstitutes = 0;
        this.teamOneScore = 0;
        this.teamTwoScore = 0;
    }


    // User Defined Constructor
    public Game(String teamOne, String teamTwo, int numOfPlayers, int numOfSubstitutes, int teamOneScore, int teamTwoScore) throws GameException {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;

        if(numOfPlayers < 0) {
            throw new GameException(1, "Invalid number of players");
        }
        this.numOfPlayers = numOfPlayers;

        if(numOfSubstitutes < 0) {
            throw new GameException(2, "Invalid number of substitutes");
        }
        this.numOfSubstitutes = numOfSubstitutes;

        if(teamOneScore < 0) {
            throw new GameException(3, "Invalid team one score");
        }
        this.teamOneScore = teamOneScore;

        if(teamTwoScore < 0) {
            throw new GameException(4, "Invalid team two score");
        }
        this.teamTwoScore = teamTwoScore;
    }

    //Setters

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public void setNumOfPlayers(int numOfPlayers) throws GameException {
        if(numOfPlayers < 0) {
            throw new GameException(1, "Invalid number of players");
        }
        this.numOfPlayers = numOfPlayers;
    }

    public void setNumOfSubstitutes(int numOfSubstitutes) throws GameException {
        if(numOfSubstitutes < 0) {
            throw new GameException(2, "Invalid number of substitutes");
        }
        this.numOfSubstitutes = numOfSubstitutes;
    }

    public void setTeamOneScore(int teamOneScore) throws GameException {
        if(teamOneScore < 0) {
            throw new GameException(4, "Invalid team two score");
        }
        this.teamOneScore = teamOneScore;
    }

    public void setTeamTwoScore(int teamTwoScore) throws GameException {
        if(teamTwoScore < 0) {
            throw new GameException(4, "Invalid team two score");
        }
        this.teamTwoScore = teamTwoScore;
    }
    // Getters

    public String getTeamOne() {
        return teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public int getNumOfSubstitutes() {
        return numOfSubstitutes;
    }

    public int getTeamOneScore(){
        return teamOneScore;
    }

    public int getTeamTwoScore(){
        return teamTwoScore;
    }


    // Scored Methods

    public void teamOneScored(int score) throws GameException {
        if(score < 0) {
            throw new GameException(5, "Score cannot be negative");
        }
        this.setTeamOneScore(this.getTeamOneScore() + score);
    }

    public void teamTwoScored(int score) throws GameException {
        if(score < 0) {
            throw new GameException(5, "Score cannot be negative");
        }
        this.setTeamTwoScore(this.getTeamTwoScore() + score);
    }

    // Who is winning
    public void whoIsWinning() {
        if(this.teamOneScore > this.teamTwoScore) {
            System.out.println(this.teamOne + " (team One) is winning, score " + this.teamOneScore);
        } else if(this.teamTwoScore > this.teamOneScore) {
            System.out.println(this.teamTwo + " (team Two) is winning, score " + this.teamTwoScore);
        } else {
            System.out.println("Its a draw!!\t" + this.teamOne + " " + this.teamOneScore + " - " + this.teamTwoScore + " " + this.teamTwo);
        }
    }


    // Display
    public String display() {
        return "Game{" +
                "teamOne='" + teamOne + '\'' +
                ", teamTwo='" + teamTwo + '\'' +
                ", numOfPlayers=" + numOfPlayers +
                ", numOfSubstitutes=" + numOfSubstitutes +
                ", teamOneScore=" + teamOneScore +
                ", teamTwoScore=" + teamTwoScore +
                '}';
    }


    // Equals
    public boolean equals(Game obj) {
        if(this.teamOne.equals(obj.teamOne) && this.teamTwo.equals(obj.teamTwo) && this.teamOneScore == obj.teamOneScore
        && this.teamTwoScore == obj.teamTwoScore && this.numOfPlayers == obj.numOfPlayers && this.numOfSubstitutes == obj.numOfSubstitutes) {
            return true;
        } else {
            return false;
        }
    }

}
