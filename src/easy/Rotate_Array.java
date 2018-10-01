package easy;

import java.util.ArrayList;

public class Rotate_Array {

    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] nArr = rotateArray(arr, k);
        for (int s : nArr) {
            System.out.print(s + ", ");
        }
    }

    private static int[] rotateArray(int[] nums, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        k %= nums.length;

        for (int i = nums.length - k; i < nums.length; i++) {
            al.add(nums[i]);
        }

        for (int j = 0; j < nums.length - k; j++) {
            al.add(nums[j]);
        }

        int[] ans = new int[nums.length];

        for (int b = 0; b < nums.length; b++) {
            ans[b] = al.get(b);
        }

        return ans;
    }
}
