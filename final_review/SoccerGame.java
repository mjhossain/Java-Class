package final_review;

public class SoccerGame extends Game {
    private String refreeName;
    private int teamOneSubstituted,  teamTwoSubstituted;

    public SoccerGame() throws GameException {
        super();
        this.setNumOfPlayers(11);
        this.setNumOfSubstitutes(5);
        this.refreeName = "Unknown";
        this.teamOneSubstituted = 0;
        this.teamTwoSubstituted = 0;
    }

    public SoccerGame(String teamOne, String teamTwo, String refreeName, int teamOneSubstituted, int teamTwoSubstituted,int teamOneScore, int teamTwoScore) throws GameException {
        super(teamOne, teamTwo, 11, 5, teamOneScore, teamTwoScore);
        this.refreeName = refreeName;

        if(teamOneSubstituted < 0) {
            throw new GameException(6, "Invalid players Substituted");
        }
        this.teamOneSubstituted = teamOneSubstituted;

        if(teamTwoSubstituted < 0) {
            throw new GameException(6, "Invalid players Substituted");
        }
        this.teamTwoSubstituted = teamTwoSubstituted;
    }

    // Setters

    public void setRefreeName(String refreeName) {
        this.refreeName = refreeName;
    }

    public void setTeamOneSubstituted(int teamOneSubstituted) throws GameException{
        if(teamOneSubstituted < 0) {
            throw new GameException(6, "Invalid players Substituted");
        }
        this.teamOneSubstituted = teamOneSubstituted;
    }

    public void setTeamTwoSubstituted(int teamTwoSubstituted) throws GameException {
        if(teamTwoSubstituted < 0) {
            throw new GameException(6, "Invalid players Substituted");
        }
        this.teamTwoSubstituted = teamTwoSubstituted;
    }

    // Getters

    public String getRefreeName() {
        return refreeName;
    }

    public int getTeamOneSubstituted() {
        return teamOneSubstituted;
    }

    public int getTeamTwoSubstituted() {
        return teamTwoSubstituted;
    }

    // Substitution Method
    public void substituteTeamOne(int subs) throws GameException {
        if(subs > 3) {
            throw new GameException(7, "Only 3 substitution allowed at a time!");
        }
        this.teamOneSubstituted++ ;
    }

    public void substituteTeamTwo(int subs) throws GameException {
        if(subs > 3) {
            throw new GameException(7, "Only 3 substitution allowed at a time!");
        }
        this.teamTwoSubstituted++ ;
    }


    // Over-riding scoring methods
    public void teamOneScored(int score){
        this.teamOneScore++;
    }

    public void teamTwoScored(int score) throws GameException {
        this.teamTwoScore++;
    }


    // Display
    public String display() {
        return super.display() + "\nSoccerGame{" +
                "refreeName='" + refreeName + '\'' +
                ", playersTeamOneSubstituted=" + teamOneSubstituted +
                ", playersTeamTwoSubstituted=" + teamTwoSubstituted +
                '}';
    }

    // Equals
    public boolean equals(SoccerGame obj) {
        if(super.equals(obj) && this.refreeName.equals(obj.refreeName) && this.teamOneSubstituted == obj.teamOneSubstituted
        && this.teamTwoSubstituted == obj.teamTwoSubstituted) {
            return true;
        } else {
            return false;
        }
    }
}
