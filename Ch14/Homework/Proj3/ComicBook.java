package Ch14.Homework.Proj3;

public class ComicBook extends LibraryContent {
    public String title, author, artist;
    public ComicBook(String publication, int pageNo, String title, String author, String artist) {
        super(publication, pageNo);
        this.title = title;
        this.author = author;
        this.artist = artist;
    }

    public void printDetails(){
        System.out.println("/Comic Book/");
        System.out.println("Publication: " + publication);
        System.out.println("Page Number: " + pageNo);
        System.out.println("Title: " + title);
        System.out.println("Author " + author);
        System.out.println("Artist: " + artist);
    }
}