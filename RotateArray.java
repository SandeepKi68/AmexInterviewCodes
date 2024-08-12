import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=2;

        k=k% nums.length;

        int[] rotatedArray= IntStream.concat
                (Arrays.stream(nums,nums.length-k,nums.length),Arrays.stream(nums,0,nums.length-k)).toArray();
        System.out.println(Arrays.toString(rotatedArray));
    }
}
