import java.util.HashMap;
import java.util.Map;

public class containsNearbyDuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums,int k){
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int previousIndex = map.get(nums[i]);
                if (i - previousIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
    public static void main(String[] args) {
        containsNearbyDuplicatesII solution = new containsNearbyDuplicatesII();
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(solution.containsNearbyDuplicate(nums, k));
    }
    }


