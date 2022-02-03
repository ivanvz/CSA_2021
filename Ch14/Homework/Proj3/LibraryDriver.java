package Ch14.Homework.Proj3;

public class LibraryDriver {
    public static void main(String args[]){
        LibraryContent libcontent = new LibraryContent("USA", 0);
        libcontent.printDetails();

        System.out.println();

        Book bk = new Book("Megadodo Publications", 250, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams");
        bk.printDetails();

        System.out.println();

        VHS vhs = new VHS("ABC", 0, "Fuller House", "Some Guy");
        vhs.printDetails();
    }
}
