import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
        System.out.println(Arrays.toString(frequencySort(arr)));
        int[] arr2 = {4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5};
        System.out.println(Arrays.toString(frequencySort(arr2)));    }
    public static int[] frequencySort(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);        }

        list.sort((a, b) -> {
            int freqCompare = Integer.compare(freqMap.get(b), freqMap.get(a));
            return freqCompare == 0 ? Integer.compare(a, b) : freqCompare;
        });

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
