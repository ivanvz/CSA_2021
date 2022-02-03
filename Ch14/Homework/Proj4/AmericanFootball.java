package Ch14.Homework.Proj4;

public class AmericanFootball extends AllSports {
    public int concussions;
    public AmericanFootball(String sportName, int teamSize, int concussions) {
        super(sportName, teamSize);
        this.concussions = concussions;
    }

//    public void setConcussions(int concussions) {
//        this.concussions = concussions;
//    }
//    public int getConcussions() {
//        return concussions;
//    }

    public void PrintDetails(){
        System.out.println("Sport Name: " + sportName);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Concussions: " + concussions);
    }
}