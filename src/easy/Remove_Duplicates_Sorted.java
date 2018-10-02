package easy;

import java.util.ArrayList;

public class Remove_Duplicates_Sorted {

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int newLength = 0;
        arrayList.add(nums[0]);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                arrayList.add(nums[i + 1]);
                newLength++;
            }
        }

        for (int j = 0; j < arrayList.size(); j++) {
            nums[j] = arrayList.get(j);
        }

        return newLength;
    }
}
