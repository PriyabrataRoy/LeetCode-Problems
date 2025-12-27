package Recursion.Patterns;

public class A_ReversePyramid {
    
    static void reversePyramid(int r,int c){
        if(r == 0){
            return;
        }

        if(c<=r){
            System.out.print("* ");
            reversePyramid( r, c+1);
        }
        else{
        System.out.println();
        reversePyramid( r-1, 1);
         }
    }

    public static void main(String[] args) {
        reversePyramid(4, 1);
    }
}
