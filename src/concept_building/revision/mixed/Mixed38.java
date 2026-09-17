
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Mixed38{
    public static int[] temp(int temp[]){
        Deque<Integer>stack  = new ArrayDeque<>();
        int result[] = new int[temp.length];
        Arrays.fill(result,0);
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[stack.peek()]<temp[i]){
                int index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int temper[] = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(temp(temper)));
    }
}