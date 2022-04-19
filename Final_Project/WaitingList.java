package Final_Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WaitingList implements WaitingListInterface{

    long phone;
    String name;

//    Constructor
    public WaitingList() {
        this.name = null;
        this.phone = 0;
    }

//    Setting and Getting
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }

//    Creation of storage array list for waiting list
    List<WaitingList> myList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

//    Creates an object storing a name and phone number, then adds to the Array List
    public void AddWaitingListMember(){
        WaitingList listMember = new WaitingList();
        System.out.println("Enter Name: ");
        listMember.setName(input.next());

        System.out.println("Enter Phone Number: ");
        listMember.setPhone(input.nextLong());

        myList.add(listMember);

        System.out.println("---" + listMember.getName() + " has been added to the waiting list---");
    }

//    Utilizes an Iterator to print the waiting list
    public void viewWaitingList() {
        Iterator<WaitingList> iter = myList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

//        for(WaitingList waitingList: myList){
//            System.out.println(waitingList);
//        }
    }
    @Override
    public String toString() {
        return this.getName() + " - " + this.getPhone();
    }
}