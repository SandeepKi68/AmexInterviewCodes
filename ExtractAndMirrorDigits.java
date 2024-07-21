import java.util.*;
import java.util.stream.Collectors;

public class ExtractAndMirrorDigits {
    public static void main(String[] args) {
        String[] input = {"ABC", "123ABC", "DEG", "34H", "JKLM", "31VW23"};

        List<String> result = Arrays.stream(input)
                .map(str -> str.replaceAll("\\D", "")) // Extract only the digits
                .filter(str -> !str.isEmpty())        // Remove empty strings resulting from no digits
                .map(digits -> digits + new StringBuilder(digits).reverse().toString()) // Concatenate with reverse
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

