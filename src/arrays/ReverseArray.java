public class ReverseArray{
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        int i=0;
        int j = arr.length-1;
        if (j<=1){
            System.out.println(arr);
        }
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(arr);
    }
}