
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Mixed63{
    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));
    }

    public static int[] dailyTemperatures(int temp[]){
        Deque<Integer>stack = new ArrayDeque<>();
        int result[] = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }
}