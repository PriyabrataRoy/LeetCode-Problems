package Recursion;

public class F_Sum_Of_Digit {

    static int SumOfDigit( int n){

        if(n == 0){
            return 0;
        }
        int rem = n%10;       

        return SumOfDigit(n/10) + rem;
    }

    public static void main(String[] args) {
        int ans = SumOfDigit(824);
        System.out.println(ans);
    }
}