import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        String original = "Madam";
        System.out.println(palindrome(original));
    }
    static boolean palindrome(String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length() / 2; i++){
            char first = str.charAt(i);
            char last = str.charAt(str.length() - i - 1);

            if(first != last) return false;
        }
        return true;
    }
}
