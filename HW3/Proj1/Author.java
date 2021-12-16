package HW3.Proj1;

public class Author {
    //declaring instance variables
    String firstName;
    String secondName;
    //constructor to initialize variables
    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    //setter methods to set firstName and lastName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    //getter methods to get firstName and lastName
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    //overriding toString() method of Object class to print Author object directly
    public String toString() {
        return firstName+" "+secondName;
    }
}
