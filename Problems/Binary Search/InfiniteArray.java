// Program to find a no from an infinite sorted array
public class InfiniteArray{
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,10,90,100,130,140,160,170,180,190,200,210};
        int target = 200;
        System.out.println(answer(nums, target));
        
    }

    static int answer(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2; //(end - start + 1) gives the size of the window
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            } 
        }
        return -1;
    }
}
