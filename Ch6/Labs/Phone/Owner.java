package Ch6.Labs.Phone;

public class Owner {
    public String firstName, lastName;
    public int SSN, DOB;

    public Owner(String first, String last, int ssn, int dob){
        firstName = first;
        lastName = last;
        SSN = ssn;
        DOB = dob;
    }

    public String getFirstName(String first){
        return firstName;
    }

    public String getLastName(String last){
        return lastName;
    }

    public int getSSN(int ssn){
        return SSN;
    }

    public int getDOB(int ssn) {
        return DOB;
    }

    public String toString(){
        String result;
        result = "Name: " + firstName + " " + lastName + "\n"
                + "SSN: " + SSN + "\n"
                + "DOB: " + DOB;
        return result;
    }
}
