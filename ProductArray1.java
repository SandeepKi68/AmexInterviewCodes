import java.util.Arrays;

public class ProductArray1 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int product = 1;
        int zeroCount = 0;
        int zeroIndex = -1;


        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            } else {
                zeroCount++;
                zeroIndex = i;
            }
        }


        if (zeroCount > 1) {
            Arrays.fill(result, 0);
            return result;
        }

        // Calculate the result
        for (int i = 0; i < n; i++) {
            if (zeroCount == 1) {
                if (i == zeroIndex) {
                    result[i] = product;
                } else {
                    result[i] = 0;
                }
            } else {

                result[i] = product / nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {0, 3, 4, 5, 6};
        int[] output = productExceptSelf(input);
        System.out.println(Arrays.toString(output));
    }
}

