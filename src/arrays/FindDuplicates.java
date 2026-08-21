import java.util.HashSet;

class FindDuplicates{
    public static void main(String[] args) {
    // int arr []={1,1,2,3,4,5};
    // int res [] = new Array();
    // int check<HashSet> = new HashSet<>;

    // for(int i=0; i<arr.length();i++){
    //     if(arr[i] in res){
    //         continue
    //     }
    //     else{
    //         res.add(arr[i])
    //     }
    // }


        int arr []={1,1,2,3,4,5};
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            if(set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
            System.out.println(set);

    }
}