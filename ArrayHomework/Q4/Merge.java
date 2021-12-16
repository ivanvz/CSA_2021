package ArrayHomework.Q4;
public class Merge {
    public static void mergeArrays(int a[], int b[], int c[], int lengthA, int lengthB){
        int i = 0, j = lengthB - 1, n = 0;

//merging 2 arrays in ascending order, then stored in third array
        while(i < lengthA && j >= 0){
            if(a[i] > b[j])
                c[n++] = b[j--];
            else c[n++] = a[i++];
        }
        while(i < lengthA){
            c[n++] = a[i++];
        }
        while(j >= 0){
            c[n++] = b[j--];
        }
    }

//sorting method!
    public static void SortArrays(int b[], int n){
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(b[j] < b[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
    }
}
