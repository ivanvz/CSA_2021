package Ch10_Ch11.excercises.sorting;

public class SortGrades
{

    public static void main (String[] args)
    {
        int[] grades = {89, 94, 69, 80, 97,97, 85, 73, 91, 77, 85, 93};
//int[] grades = {1, 1, 2, 2, 3,3, 3, 4, 4, 4, 4, 5};
        for (int i : grades)
            System.out.print (i + " ");
        System.out.println ();

        Sorts.selectionSort(grades);

        for (int x : grades)
            System.out.print (x + " ");
        System.out.println ();

        Sorts.insertionSort (grades);
        for (int x : grades)
            System.out.print (x + " ");
        System.out.println ();

//        Sorts.insertionSort_R (grades);
        for (int x : grades)
            System.out.print (x + " ");
    }
}
