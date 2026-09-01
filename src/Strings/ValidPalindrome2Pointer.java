public class ValidPalindrome2Pointer{
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = s.toLowerCase();
        boolean answer=false;
        String s4 = s1.replaceAll("[^a-z0-9]","");
        int i =0;
        int j = s4.length() - 1;
        while(i<j){
            char x = s4.charAt(i);
            char y = s4.charAt(j);
            if(x!=y){
                System.out.println(answer);
                return;
            }
            i++;
            j--;

        }
        answer=true;
        System.out.println(answer);
    }
}