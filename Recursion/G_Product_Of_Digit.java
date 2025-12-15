package Recursion;

public class G_Product_Of_Digit {
    static int productofDigit(int n){
        if(n == 0){
            return 1;
        }

        return productofDigit(n/10) * n%10;
    }

    public static void main(String args[]){
        int ans = productofDigit(123);
        System.out.println(ans);
    }
}
