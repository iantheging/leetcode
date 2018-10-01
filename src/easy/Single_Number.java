package easy;

import java.util.HashMap;

public class Single_Number {

    private int singleNumber(int[] nums) {
        HashMap<Integer, Integer> firstAppearance = new HashMap<>();
        HashMap<Integer, Integer> twiceAppearance = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (firstAppearance.get(nums[i]) != null) {
                twiceAppearance.put(nums[i], nums[i]);
            }
            else {
                firstAppearance.put(nums[i], nums[i]);
            }
        }

        for (int i: nums) {
            if (twiceAppearance.get(nums[i]) == null) {
                return nums[i];
            }
        }

        return 0;
    }
}
