package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plus_One {

    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        if (digits[lastIndex] != 9) {
            digits[lastIndex]++;
        } else {
            overflow(digits, lastIndex);
        }
        if (digits[0] != 10) {
            return digits;
        } else {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            digits[0] = 0;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }
    }

    public void overflow(int[] digits, int start) {
        if (start == 0) {
            digits[0] = 10;
        } else if (digits[start - 1] == 9) {
            digits[start] = 0;
            overflow(digits, start - 1);
        } else {
            // base case
            digits[start] = 0;
            digits[start - 1]++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {9, 9};
        System.out.println("Original: " + Arrays.toString(arr));
        Plus_One po = new Plus_One();
        System.out.println("Plus One: " + Arrays.toString(po.plusOne(arr)));
    }
}
