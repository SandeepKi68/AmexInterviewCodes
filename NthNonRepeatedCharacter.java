import java.util.*;
import java.util.stream.Collectors;

public class NthNonRepeatedCharacter {
    public static Character findNthNonRepeatedCharacter(String str, int n) {

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }


        int count = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count == n) {
                    return entry.getKey();
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String input = "swiss";
        int n = 2;
        Character nthNonRepeatedChar = findNthNonRepeatedCharacter(input, n);
        System.out.println(nthNonRepeatedChar);
    }
}
