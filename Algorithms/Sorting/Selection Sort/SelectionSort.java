import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
         int[] arr = { 3, 2, 6, 9, 34, 5, 4, 0, 32, 29, 11 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last); 
        }
    }
    static int getMaxIndex(int[] arr,int start,int last){
        int maxIndex = start;
        for(int j = start; j <= last; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            return maxIndex;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
