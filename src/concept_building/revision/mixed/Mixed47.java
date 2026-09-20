
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Mixed47{
    public static int[] dailyTemperatures(int[] temperatures){
        Deque<Integer>stack = new ArrayDeque<>();
        int result[] = new int[temperatures.length];
        Arrays.fill(result,0);
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temp)));
        //[1,1,4,2,1,1,0,0]
    }
}