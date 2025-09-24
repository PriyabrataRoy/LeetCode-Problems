public class Sqrt_x {
    public int mySqrt(int num) {
        long start = 1;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return (int) mid;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) end;
    }

    
    public static void main(String[] args) {
        Sqrt_x obj = new Sqrt_x();

        int num1 = 8;
        int num2 = 16;

        System.out.println("Square root of " + num1 + " = " + obj.mySqrt(num1));
        System.out.println("Square root of " + num2 + " = " + obj.mySqrt(num2));
    }
}
