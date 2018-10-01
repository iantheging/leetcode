package easy;

import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum {

    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter 5 values for array");
//        int[] nums = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Value: ");
//            nums[i] = scan.nextInt();
//        }
//        int[] response = Solution(nums, 7);
//        for (int ans : response) {
//            System.out.println(ans);
//        }

        int[] single = new int[]{1, 3, 4, 3, 1};
        System.out.println(singleNumber(single));
    }

    private static int[] Solution(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return ans;
    }

    private static int singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = a^nums[i];
        }
        return a;
    }
}
