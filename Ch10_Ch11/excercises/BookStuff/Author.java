package Ch10_Ch11.excercises.BookStuff;

public class Author {
    String firstName;
    String lastName;
    String bookName;

    Author(String first, String last, String book){
        this.firstName = first;
        this.lastName = last;
        this.bookName = book;
    }

    public String toString(){
        String book = bookName + ", by " + lastName + " " + firstName;
        return book;
    }
}
