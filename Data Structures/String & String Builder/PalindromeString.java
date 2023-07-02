import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        String original = "MadaM";
        String reverse = new String("");

        for(int i = 0; i < original.length(); i++){
            char ch = original.charAt(i);
            reverse = ch + reverse;  
        }
        System.out.println(reverse.equals(original));
    }
}
