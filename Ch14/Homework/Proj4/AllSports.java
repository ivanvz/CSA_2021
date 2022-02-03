package Ch14.Homework.Proj4;

public class AllSports {
    public String sportName;
    public int teamSize;

    public AllSports(String sportName, int teamSize){
        this.sportName = sportName;
        this.teamSize = teamSize;
    }

    public void setSportName(String sportName){
        this.sportName = sportName;
    }
    public String getSportName() {
        return sportName;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public int getTeamSize() {
        return teamSize;
    }
}