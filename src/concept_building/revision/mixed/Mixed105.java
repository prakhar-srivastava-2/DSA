
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed105{
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int count=0;
        int preq[] = new int[numCourses];
        Deque<Integer>queue = new ArrayDeque<>();
        for(int edge[]:prerequisites){
            int u = edge[0];
            int v = edge[1];
            graph.get(v).add(u);
            preq[u]++;
        }
        for(int i=0;i<numCourses;i++){
            if(preq[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int curr = queue.poll();
            count++;
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                preq[neighbor]--;
                if(preq[neighbor]==0){
                    queue.offer(neighbor);
                }
            }
        }
        return count==numCourses;
    }
    public static void main(String[] args) {
        Mixed105 solution = new Mixed105();

        int numCourses1 = 2;
        int[][] prerequisites1 = {
            {1, 0}
        };

        System.out.println(solution.canFinish(numCourses1, prerequisites1)); // true

        int numCourses2 = 2;
        int[][] prerequisites2 = {
            {1, 0},
            {0, 1}
        };

        System.out.println(solution.canFinish(numCourses2, prerequisites2)); // false
    }
}