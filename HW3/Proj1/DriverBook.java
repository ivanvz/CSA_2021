package HW3.Proj1;

public class DriverBook {
    public static void main(String[] args) {
        //creating an instance of Book banana
        Book banana = new Book("Dune", new Author("Frank", "Herbert"), 9.89);
        //printing information of Book banana
        System.out.println(banana);
    }
}
