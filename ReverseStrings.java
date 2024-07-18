import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStrings {
    public static void main(String[] args) {
        Set<String> input = Set.of("ABC", "123ABC", "DEG", "34H", "XYZ");

        Set<String> result = input.stream()
                // Filter out strings containing numeric characters
                .filter(s -> !s.matches(".*\\d.*"))
                // Reverse each string
                .map(s -> new StringBuilder(s).reverse().toString())
                // Collect the results into a Set
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}

