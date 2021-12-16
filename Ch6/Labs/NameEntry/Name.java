package Ch6.Labs.NameEntry;

public class Name {
    public String first, middleInitial, last;
    public String firstInitial;
    public String lastInitial;
    public String fullInitials;

    public int firstLength, lastLength;

    public Name(String first, String middleInitial, String last) {
    }


    public String GetFirst(){
        return first;
    }

    public String GetMiddleInitial(){
        return middleInitial;
    }

    public String GetLast(){
        return last;
    }

    public void SetInitials(){
        firstInitial = first.substring(0);
        middleInitial = middleInitial;
        lastInitial = last.substring(0);
    }

    public String GetInitials(){
        return firstInitial + middleInitial + lastInitial;
    }

    public void SetNameLength(){
        firstLength = first.length();
        lastLength = last.length();
    }
    
    public int GetNameLength(){
        return firstLength + lastLength + 1;
    }
}
