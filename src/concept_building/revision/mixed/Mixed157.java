
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Mixed157{
    public static int[] dailyTemp(int temp[]){
        int res[] = new int[temp.length];
        Arrays.fill(res,0);
        Deque<Integer>stack = new ArrayDeque<>();
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int index = stack.pop();
                res[index] = i-index;
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int temp[] = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemp(temp)));
    }
}