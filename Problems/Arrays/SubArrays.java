// Print all the possible sub arrays of thr Array
public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printSubArrays(arr);
    }
    static void printSubArrays(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

