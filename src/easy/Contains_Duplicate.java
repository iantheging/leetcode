package easy;

import java.util.HashMap;

public class Contains_Duplicate {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> foundValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (foundValues.containsKey(nums[i])) {
                return true;
            } else {
                foundValues.put(nums[i], nums[i]);
            }
        }
        return false;
    }
}
