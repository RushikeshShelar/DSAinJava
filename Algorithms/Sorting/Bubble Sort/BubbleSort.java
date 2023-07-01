import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {3,2,6,9,34,5,4,0,32,29,11};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]){
        boolean swapped = false;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(swapped){
                continue;
            }else{
                break;
            }
        }
    }
}