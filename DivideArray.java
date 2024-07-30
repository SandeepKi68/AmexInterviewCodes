
import java.util.Arrays;

public class DivideArray {
    public static int[] divideArray(int[] nums, int x) {
        int n = nums.length;
        int[] result = new int[n];


        for (int i = 0; i < n; i++) {
            result[i] = x / nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 4, 5, 6};
        int x = 720;
        int[] output = divideArray(input, x);
        System.out.println(Arrays.toString(output));
    }
}
