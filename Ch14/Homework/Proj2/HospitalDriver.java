package Ch14.Homework.Proj2;

public class HospitalDriver {
    public static void main(String args[]){
        Administrator admin = new Administrator();
        Doctor doc = new Doctor();
        Janitor janitor = new Janitor();
        Nurse nurse = new Nurse();
        Receptionist recep = new Receptionist();
        Surgeon surgeon = new Surgeon();


        System.out.println("---Admin---");
        System.out.println(admin.Location());
        System.out.println(admin.salary());
        System.out.println("Status: " + admin.status());

        System.out.println();

        System.out.println("---Doctor---");
        System.out.println(doc.salary());
        System.out.println("Status: " + doc.status());

        System.out.println();

        System.out.println("---Janitor---");
        System.out.println(janitor.salary());
        System.out.println("Status: " + janitor.status());
    }
}
