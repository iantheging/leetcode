package easy;

public class First_Bad_Version {

    public int firstBadVersion(int n) {
        if (isBadVersion(n / 2)) {

        }
        return 0;
    }

    public int firstHelper(int min, int max) {
        if (isBadVersion(min)) {
            return -1;
        } else if (isBadVersion(max)) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean isBadVersion(int n) {
        return false;
    }
}
