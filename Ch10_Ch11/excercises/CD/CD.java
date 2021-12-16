package Ch10_Ch11.excercises.CD;

public class CD {
    private String title, artist;
    private double cost;
    private int tracks;

    public CD (String title, String artist, double cost, int tracks){
        this.title = title;
        this.artist = artist;
        this.cost = cost;
        this.tracks = tracks;
    }

    public String toString(){
        String output = title + ", " + artist + " [ $" + cost + ", Tracks: ";
        return output;
    }
}
