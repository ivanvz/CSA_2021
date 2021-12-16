package Ch10_Ch11.labs.Contact;

public class Contact {
    String firstName;
    String lastName;
    long phoneNumber;
    long zipCode;

    Contact(String first, String last, long phone, long zip){
        this.firstName = first;
        this.lastName = last;
        this.phoneNumber = phone;
        this.zipCode = zip;
    }

    public String toString(){
        String contact = firstName + " " + lastName + "\t" + zipCode + "\t" + phoneNumber;
        return contact;
    }
}
