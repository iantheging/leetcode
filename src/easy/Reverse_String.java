package easy;

public class Reverse_String {

    private static String reverseString(String s) {
        int len = s.length();
        char[] work = new char[len];
        for (int i = 0; i < len; i++) {
            work[i] = s.charAt(len - 1 - i);
        }
        return new String(work);
    }

    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str);
        System.out.println(reverseString(str));
    }
}
