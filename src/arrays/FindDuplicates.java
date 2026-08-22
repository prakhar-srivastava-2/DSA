import java.util.HashSet;

class FindDuplicates{
    public static void main(String[] args) {

        int arr []={1,1,2,3,4,5};
        HashSet<Integer> result = new HashSet<>();
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            if(set.contains(arr[i])){
                result.add(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
            System.out.println(result);

    }
}