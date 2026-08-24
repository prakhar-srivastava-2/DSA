public class Sum{
    public static void main(String[] args) {
        int number = 5;
        System.out.println(sumi(number));

    }

    public static int sumi(int n){
        if (n==1){
            return 1;
        }
        if (n>1){
            return n+sumi(n-1);
        }
        return 0;
    }
}