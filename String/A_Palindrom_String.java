package String;
import java.util.*;
public class A_Palindrom_String {


    static boolean checkPalindrom(String str){
        int start = 0;
        int end = str.length()-1;
       str =  str.toLowerCase();
        str = str.trim();
        while(start<=end){
            if (str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }

        return true;
    }
    public static void main(String as[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter The String = ");
        String str = ob.nextLine();

        if(checkPalindrom(str)){
            System.out.print("Palindrom String");
        }
        else{
            System.out.print("Not Palindrom String");
        }

    }
}
