public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Valid_Perfect_Square obj = new Valid_Perfect_Square();

        int num1 = 16;
        int num2 = 14;

        System.out.println(num1 + " is perfect square? " + obj.isPerfectSquare(num1));
        System.out.println(num2 + " is perfect square? " + obj.isPerfectSquare(num2));
    }
}
