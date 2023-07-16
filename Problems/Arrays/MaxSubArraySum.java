// Return the Maximum sum of the Sub array of an Array out of all possible sub SubArrays
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10};
        printSubArrays(arr);
    }
    // Optimised Solution USes O(n^2) time Complexity and O(n) Space Complexity
    static void printSubArrays(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1]; //When Start is 0 to avaoid IndexOutOfBound Error;
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}

// Brute Force Apporch Uses O(n^3) time Complexicity

    // static void printSubArrays(int[] arr){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int i = 0; i < arr.length; i++){
    //         int start = i;
    //         for(int j = i; j < arr.length; j++){
    //             currSum = 0;
    //             int end = j;
    //             for(int k = start; k <= end; k++){
    //                 currSum += arr[k];
    //             }
    //             if(currSum > maxSum){
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println(maxSum);
    // }