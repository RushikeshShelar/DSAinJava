public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10,12,0,1,3,4,6};
        int rotation = pivotElement(arr) + 1;
        System.out.println(rotation);
    }
     public static int pivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }else if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
