package Recursion;

public class J_CountZeros {
    
    static int countZeros(int n){
        return helper(n,0);
    }

    static int helper(int n, int count){
        if(n == 0){
            return count;
        }

        if(n%10 == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }


    public static void main(String as[]){
        int ans = countZeros(1002450000);

        System.out.println(ans);
    }
}
