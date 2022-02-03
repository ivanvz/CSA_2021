package Ch14.Homework.Proj4;

public class Hockey extends AllSports {
    String mostUnpronouncableName;
    public Hockey(String sportName, int teamSize, String mostUnpronouncableName) {
        super(sportName, teamSize);
        this.mostUnpronouncableName = mostUnpronouncableName;
    }

//    public void setMostUnpronouncableName(String mostUnpronouncableName) {
//        this.mostUnpronouncableName = mostUnpronouncableName;
//    }
//    public String getMostUnpronouncableName() {
//        return mostUnpronouncableName;
//    }

    public void PrintDetails() {
        System.out.println("Sport Name: " + sportName);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Unpronounceable Player Name: " + mostUnpronouncableName);
    }
}
