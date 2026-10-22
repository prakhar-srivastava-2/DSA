
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Mixed135{
    public static int[] dailyTemperatures(int[] temperatures){
        if(temperatures.length==0){
            return new int[0];
        }
        Deque<Integer>stack = new ArrayDeque<>();
        int result[] = new int[temperatures.length];
        Arrays.fill(result, 0);
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index = stack.pop();
                int num = i-index;
                result[index] = num;
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));
    }
}