package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class First_Unique_Char {

    private static int firstUniqChar(String s) {
        HashMap<Character, Integer> mentioned = new HashMap<>();
        HashMap<Character, Integer> onceMentioned = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (onceMentioned.containsKey(s.charAt(i))) {
                mentioned.put(s.charAt(i), i);
            } else {
                onceMentioned.put(s.charAt(i), i);
            }
        }

        for (int j = 0; j < s.length(); j++) {
            if (!mentioned.containsKey(s.charAt(j))) {
                return j;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String test = "lolol";
        System.out.println("Expected: -1");
        System.out.println("Actual: " + firstUniqChar(test));
    }
}
