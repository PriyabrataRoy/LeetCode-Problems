package Recursion;

public class K_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    static int numberOfSteps(int num){
        return helper (num,0);
    }

    static int helper(int num , int steps){
        
        if (num == 0){
            return steps;
        }
        if(num%2 == 0){
            return helper(num/2, steps+1);
        }
        return helper(num-1,steps+1);
    }

    public static void main (String as[]){
        int ans = numberOfSteps(14);
        System.out.println(ans);
    }
}
