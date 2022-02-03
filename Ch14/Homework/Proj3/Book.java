package Ch14.Homework.Proj3;

public class Book extends LibraryContent {
    public String title, author;
    public Book(String publication, int pageNo, String title, String author) {
        super(publication, pageNo);
        this.title = title;
        this.author = author;
    }

    public void printDetails(){
        System.out.println("/Book/");
        System.out.println("Publication: " + publication);
        System.out.println("Page Number: " + pageNo);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}