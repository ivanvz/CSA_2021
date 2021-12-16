package HW3.Proj2;

public class Movie {
    private String title;
    private String studio;
    private String rating;

//     a
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

//     b
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

//    tooString
    public String toString(){
        return "Movie: " + title +
                "\nStudio: " + studio +
                "\nRating: " + rating;
    }
}