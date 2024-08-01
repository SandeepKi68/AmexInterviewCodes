import java.util.HashSet;
import java.util.Set;

public class LongestUniqueCharacterSubsequence {
    public static String longestUniqueSubsequence(String str) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();


        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) { 
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = longestUniqueSubsequence(input);
        System.out.println(result); // Output: "abc"
    }
}

