package Recursion;

public class E_Sum_Of_N_No {
    static int SumOfNno(int n){
        if(n == 0){
            return 0;
        }

        return n + SumOfNno(n-1);
    }

    public static void main(String[] args) {
        int ans = SumOfNno(5);
        System.out.println(ans);
    }
}
