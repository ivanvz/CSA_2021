package HW3.Proj1;

public class Book {
    //declaring instance variables
    String title;
    Author auth;
    double price;
    //constructor to initialize variables
    public Book(String title, Author auth, double price) {
        this.title = title;
        this.auth = auth;
        this.price = price;
    }
    //setter methods to set title,auth and price
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuth(Author auth) {
        this.auth = auth;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    //getter methods to get title and auth
    public String getTitle() {
        return title;
    }

    public Author getAuth() {
        return auth;
    }
    //overriding toString() method of Object class to print Book object directly
    public String toString() {
        //calling toString() of Author class to print author information
        return "\nBook title: "+title+"\nAuthor: "+auth.toString()+"\nPrice: "+price;
    }
}
