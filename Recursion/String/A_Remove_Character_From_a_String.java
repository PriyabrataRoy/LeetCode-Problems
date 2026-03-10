package Recursion.String;

public class A_Remove_Character_From_a_String {
    static String removeCharacter(String str,String ans,int i,char rm){

        if(i > str.length()-1){
            return ans;
        }

        if(str.charAt(i) != rm){
            return removeCharacter(str,ans + str.charAt(i), i+1, rm);
        }

        return removeCharacter(str, ans, i+1, rm);
        
    }

    //Second way to do this problem is creating ne veriable at every function call
    static void skip(String str,String ans,char rm){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if(ch == rm){
            skip(str.substring(1), ans, rm);
        }
        else{
            skip(str.substring(1), ans+ch, rm);
        }
    }

    //Third way

    static String skip2(String str,char rm){
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(ch == rm){
            return skip2(str.substring(1), rm);
        }
        else{
            return ch + skip2(str.substring(1), rm);
        }
    }

    public static void main(String as[]){
        String str = "abcdab";
        char rm = 'a';
        String ans = removeCharacter(str, "", 0, rm);
        System.out.println(ans);

        //Second way to do this thing
        skip(str,"", rm);

        //Third way
        String ans3 = skip2(str, rm);
        System.out.println(ans3);
    }
}
