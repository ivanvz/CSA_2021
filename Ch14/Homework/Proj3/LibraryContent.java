package Ch14.Homework.Proj3;

public class LibraryContent {
    String publication;
    int pageNo;

    public LibraryContent(String publication, int pageNo){
        this.publication = publication;
        this.pageNo = pageNo;
    }

    public void printDetails(){
        System.out.println("/Library General Content/");
        System.out.println("Publication: " + publication);
        System.out.println("Page Number: " + pageNo);
    }
}
