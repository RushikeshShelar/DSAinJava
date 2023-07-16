// Return the Maximum sum of the Sub array of an Array out of all possible sub SubArrays
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        printSubArrays(arr);
    }
    static void printSubArrays(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                currSum = 0;
                int end = j;
                for(int k = start; k <= end; k++){
                    currSum += arr[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
