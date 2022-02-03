package Ch14.Homework.Proj4;

public class Football extends AllSports {
    int redCards;
    public Football(String sportName, int teamSize, int redCards) {
        super(sportName, teamSize);
        this.redCards = redCards;
    }

//    public void setRedCards(int redCards) {
//        this.redCards = redCards;
//    }
//    public int getRedCards() {
//        return redCards;
//    }

    public void PrintDetails() {
        System.out.println("Sport Name: " + sportName);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Red Cards: " + redCards);
    }
}