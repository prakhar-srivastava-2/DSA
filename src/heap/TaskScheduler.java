
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler{
    public static int leastInterval(char[] tasks, int n){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i],map.get(tasks[i])+1);
            }
            else{
                map.put(tasks[i],1);
            }
        }
        PriorityQueue<Character>heap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Map.Entry<Character,Integer>mp : map.entrySet()){
            heap.offer(mp.getKey());
        }
        int time = 0;
        while(!heap.isEmpty()){
            List<Character>used = new ArrayList<>();
            int cycle = n+1;
            while(cycle>0 && !heap.isEmpty()){
                char task = heap.poll();
                map.put(task,map.get(task)-1);
                time++;
                if(map.get(task)>0){
                    used.add(task);
                }
                cycle --;
            }
            for(int i=0;i<used.size();i++){
                heap.offer(used.get(i));
            }
            if(!heap.isEmpty()){
                time+=cycle;
            }
        }
        return time;
    }
    public static void main(String[] args) {
        char tasks[] = {'A','A','A','B','B','B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }
}