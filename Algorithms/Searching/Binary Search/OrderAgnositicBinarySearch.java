public class OrderAgnositicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,1,0};
        int target = 8;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else{
                if(isAsc){
                    if (arr[mid] < target) {
                        start = mid + 1;
                    } else{
                        end = mid - 1;
                    }
                }else{
                    if (arr[mid] > target) {
                        start = mid + 1;
                    } else{
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
