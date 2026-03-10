package Recursion.String;

public class B_Remove_A_Word_From_The_String {
    static String skipWord(String str,String skipWord){
        if(str.isEmpty()){
            return"";
        }
        
        if(str.startsWith(skipWord)){
            return skipWord(str.substring(skipWord.length()),skipWord);

        }
        
        else{
           
            return str.charAt(0) + skipWord(str.substring(1), skipWord);
        }
    }
    
    //3Q Skip only  "app" word if "apple" whole word is not exist
    static String skipAppIfAppleNotExist(String str,String skipWord){
        if(str.isEmpty()){
            return "";

        }

        if(str.startsWith("app") && !str.startsWith(skipWord)){
           return skipAppIfAppleNotExist(str.substring(3), skipWord);
        }
        else{
            return str.charAt(0) + skipAppIfAppleNotExist(str.substring(1), skipWord);
        }
    }

    public static void main(String[] args) {
        String str = "abcdapplefgh";
        String skipWord = "apple";
        String ans = skipWord(str, skipWord);
        System.out.println(ans);
        String ans2 = skipAppIfAppleNotExist("abcdapplopd", skipWord);
        System.out.println(ans2);
    }
}
