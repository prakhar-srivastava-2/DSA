
import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfStudentsUnableToEatSandwich{
    public static int countStudents(int[] students, int[] sandwiches){
        Deque<Integer>sandwich = new ArrayDeque<>();
        Deque<Integer>student = new ArrayDeque<>();
        for(int i = 0;i<sandwiches.length;i++){
            sandwich.offer(sandwiches[i]);
            student.offer(students[i]);
        }
        int count = 0;
        while(!sandwich.isEmpty()){
            int firstStudent = student.peekFirst();
            int firstSandwich = sandwich.peekFirst();
            if(firstSandwich==firstStudent){
                student.poll();
                sandwich.poll();
                count=0;
            }
            else{
                int last = student.poll();
                student.offer(last);
                count+=1;
                if(count==student.size()){
                    return student.size();
                }

            }
        }
        return student.size();
    }

    public static void main(String[] args) {
        int students[] = {1,1,1};
        int sandwiches[] = {0,0,0};
        System.out.println(countStudents(students, sandwiches));
    }
}