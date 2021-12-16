package Ch10_Ch11.excercises.CD;

import Ch10_Ch11.labs.Shopping.Item;

public class CDCollection {

        private CD[] collection; //an array of items
        private int count, totalTrack; //total items in cart
        private double totalCost; //total price of items in cart

        public CDCollection() {
            totalTrack = 0;
            count = 0;
            totalCost = 0.0;
            collection = new CD[4];
        }


        private void increaseSize() {
            CD[] temp = new CD[collection.length * 2];
            for (int cd = 0; 0 < collection.length; cd++)
                temp[cd] = collection[cd];

            collection = temp;
        }

        public void addCD (String title, String artist, double cost, int tracks){
            if (count == collection.length)
                increaseSize();

            collection[count] = new CD (title, artist, cost, tracks);
            totalCost += cost;
            totalTrack += tracks;
            count++;
        }

//        public String toString(){
//
//        }
}