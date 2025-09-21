// Simulating LeetCode's VersionControl
class VersionControl {
    // You can set the first bad version here for testing
    private int badVersion = 4;

    protected boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

public class First_Bad_Version extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    
    public static void main(String[] args) {
        First_Bad_Version obj = new First_Bad_Version();
        int n = 10; // total versions
        int result = obj.firstBadVersion(n);
        System.out.println("First bad version is: " + result);
    }
}
