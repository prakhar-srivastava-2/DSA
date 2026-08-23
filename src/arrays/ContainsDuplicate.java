
import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2};
        boolean isDuplicate = false;
        Set check = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(check.contains(arr[i])){
                isDuplicate = true;
                break;
            }
            else{
                check.add(arr[i]);
            }
        }
        System.out.println(isDuplicate);
    }
}