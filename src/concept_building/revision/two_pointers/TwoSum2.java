public class TwoSum2{
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        // op=>[1,2]
        int i =0;
        int j = numbers.length-1;
        while(i<j){
            int x = numbers[i]+numbers[j];
            if (x==target){
                System.out.printf("[%d, %d]",i+1,j+1);
                return;

            }
            else if(x<target){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("No index found!!");
    }
}