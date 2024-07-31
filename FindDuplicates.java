import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 3, 5, 6, 1, 1};
        List<Integer> numList = Arrays.stream(nums).boxed().toList();

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = numList.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println(duplicates);
    }
}

