package Ch14.Homework.Proj3;

public class VHS extends LibraryContent {
    public String title, director;
    public VHS(String publication, int pageNo, String title, String director) {
        super(publication, pageNo);
        this.title = title;
        this.director = director;

    }

    public void printDetails(){
        System.out.println("/VHS Tape/");
        System.out.println("Publication: " + publication);
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
    }
}