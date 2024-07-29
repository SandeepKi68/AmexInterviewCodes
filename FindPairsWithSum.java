import java.util.HashSet;
import java.util.Set;

class FindPairsWithSum {

    public static void printPairs(int[] arr, int n, int sum)
    {
        int count = 0;
        Set<String> dup = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    String pair1 = arr[i] + "," + arr[j];
                    String pair2 = arr[j] + "," + arr[i];

                    if (!dup.contains(pair1)
                            && !dup.contains(pair2)) {
                        System.out.println("(" + arr[i]
                                + ", " + arr[j]
                                + ")");
                        dup.add(pair1);
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 1,2,3,4,5,6 };
        int n = arr.length;
        int sum = 7;
        printPairs(arr, n, sum);
    }
}



