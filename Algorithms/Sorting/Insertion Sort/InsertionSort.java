import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
         int[] arr = { 3, 2, 6, 9, 34, 5, 4, 0, 32, 29, 11 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int currentElement = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > currentElement){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = currentElement;

        }
    }
}
