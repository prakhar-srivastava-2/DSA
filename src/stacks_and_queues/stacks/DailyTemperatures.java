
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemperatures{
    public static int[] dailyTemperatures(int[] temp){
        //temperatures = [73,74,75,71,69,72,76,73]
        //op =>[1, 1, 4, 2, 1, 1, 0, 0]
        int answer[] = new int[temp.length];
        Arrays.fill(answer,0);
        Deque<Integer>stack = new ArrayDeque<>();
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int index = stack.pop();
                answer[index] = i-index;
            }
            stack.push(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int temperatures[] = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}