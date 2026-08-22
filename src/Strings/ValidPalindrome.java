public class ValidPalindrome{
public static void main(String[] args) {
    String word = "malayalam";
    int i=0;
    boolean isPalindrome = true;
    int j = word.length() - 1;
    while(i<j){
        if (word.charAt(i)==word.charAt(j)){
            i++;
            j--;
        }

        else{
            isPalindrome = false;
            break;
        }

    }
    System.out.println(isPalindrome);

}
}