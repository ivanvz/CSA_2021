package Ch10_Ch11.excercises;

public class ArrayPractice {
    public static void main(String[] args){
        int arr1[] = new int[5];
        double arr2 [] = {1.0, 2.2, 3.3, 4.4};

        String SrrArr[] = {"John", "Lisa", "Kim"};

        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;

        for (int i=0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("Take it back now ya'll");

        for (int i= arr1.length-1; i >= 0; i--){
            System.out.println(arr1[i]);
        }

//        New Shit: ADVANCED LOOOOOP
        System.out.println("\nAdvanced Loop:");
        for(int value : arr1){
            System.out.println(value);
        }
    }
}
