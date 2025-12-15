package Recursion;
public class I_Palindrome_No {
    
    static int rev(int n){
        if(n < 10){
            return n;
        }

        int digits = (int)Math.log10(n);
        int rem = n%10;

        return rem* (int)Math.pow(10,digits) + rev(n/10);
    }

    static boolean palindrome(int n){
        return n == rev(n);
    }

    public static void main (String as[]){
        boolean ans = palindrome(121);
        System.out.println(ans);
    }
}
