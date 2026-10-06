
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed92{
    public static boolean canFinish(int numCourses, int[][] prerequisites){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int indegree[] = new int[numCourses];
        for(int edge[]:prerequisites){
            int u = edge[0];
            int v = edge[1];
            graph.get(v).add(u);
            indegree[u]++;
        }
        int count=0;
        Deque<Integer>queue = new ArrayDeque<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int curr = queue.poll();
            count++;
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    queue.offer(neighbor);
                }
            }
        }
        return count==numCourses;
    }
    public static void main(String[] args) {

        int numCourses = 2;

        int[][] prerequisites = {
            {1, 0}
        };

        System.out.println(canFinish(numCourses, prerequisites));


        int[][] prerequisites2 = {
            {1, 0},
            {0, 1}
        };

        System.out.println(canFinish(numCourses, prerequisites2));
    }
}