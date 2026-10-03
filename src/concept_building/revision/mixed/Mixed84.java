public class Mixed84{
    public static boolean isPalindrome(String s){
        String s1 = s.toLowerCase();
        String s2  = s1.replaceAll("[^a-z0-9]", "");
        int i=0;
        int j = s2.length()-1;
        if(s2.length()<=1){
            return true;
        }

        while(i<j){
            if(s2.charAt(i)==s2.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}