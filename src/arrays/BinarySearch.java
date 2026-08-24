public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(binaryS(arr,target,low,high));
        }
        public static int binaryS(int arr[],int target, int low, int high){
            if (low > high){
                return -1;
            }
            int mid = (low+high)/2;
            if (arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                return binaryS(arr, target,mid+1,high);
            }
            if (arr[mid]>target){
                return binaryS(arr, target,low,mid-1);
            }
            return -1;
        }
    }