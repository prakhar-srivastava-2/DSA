
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed126{
    public boolean canFinish(int numCourses, int[][] prerequisites){
        List<List<Integer>>graph = new ArrayList<>();
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
        int count = 0;
        Deque<Integer>queue = new ArrayDeque<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int curr = queue.poll();
            indegree[curr]--;
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
        Mixed126 solution = new Mixed126();

        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println(solution.canFinish(numCourses1, prerequisites1));
        // Expected: true

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println(solution.canFinish(numCourses2, prerequisites2));
        // Expected: false

        int numCourses3 = 4;
        int[][] prerequisites3 = {{1, 0}, {2, 1}, {3, 2}};
        System.out.println(solution.canFinish(numCourses3, prerequisites3));
        // Expected: true

        int numCourses4 = 3;
        int[][] prerequisites4 = {{1, 0}, {2, 0}};
        System.out.println(solution.canFinish(numCourses4, prerequisites4));
        // Expected: true

        int numCourses5 = 3;
        int[][] prerequisites5 = {};
        System.out.println(solution.canFinish(numCourses5, prerequisites5));
        // Expected: true
    }
}