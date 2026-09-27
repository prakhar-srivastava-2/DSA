
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CourseSchedule{
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int indirect[] = new int[numCourses];
        boolean visited[] = new boolean[numCourses];
        for(int edges[]:prerequisites){
            int u = edges[0];
            int v = edges[1];
            graph.get(v).add(u);
            indirect[u]++;
        }
        Deque<Integer>queue = new ArrayDeque<>();
        for(int i=0;i<numCourses;i++){
            if(indirect[i]==0){
                queue.offer(i);
            }
        }
        List<Integer>res = new ArrayList<>();
        while(!queue.isEmpty()){
            int curr = queue.poll();
            res.add(curr);
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                indirect[neighbor]--;
                if(indirect[neighbor]==0){
                    queue.offer(neighbor);
                }
            }
        }
        if(res.size()==numCourses){
            return true;
        }
        return false;
    }
//     public static void main(String[] args) {

//     int numCourses = 4;

//     int[][] prerequisites = {
//         {1, 0},
//         {2, 1},
//         {3, 2}
//     };

//     System.out.println(canFinish(numCourses, prerequisites));
// }
public static void main(String[] args) {

    int numCourses = 2;

    int[][] prerequisites = {
        {1, 0},
        {0, 1}
    };

    System.out.println(canFinish(numCourses, prerequisites));
}
}