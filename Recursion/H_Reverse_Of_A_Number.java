package Recursion;

public class H_Reverse_Of_A_Number {
    // static int reverse(int n,int sum){
    //     if(n == 0){
    //         return sum;
    //     }

    //     int rem = n%10;
    //     sum = sum*10 + rem;

    //     return reverse(n=n/10, sum);
    // } // This is tail recursion because the result is stored in an extra variable (sum) that is passed along every recursive call.

    static int reverse (int n){
        if(n<10){
            return n;
        }

        int rem = n%10;
        int digits = (int)Math.log10(n);

        return rem * (int)Math.pow(10, digits) + reverse(n/10);
    }

    public static void main(String[] args) {
        int ans = reverse(1234);

        System.out.println(ans);
    }
}
