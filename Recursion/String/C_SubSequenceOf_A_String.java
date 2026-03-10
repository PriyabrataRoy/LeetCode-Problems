package Recursion.String;

import java.util.ArrayList;

public class C_SubSequenceOf_A_String {
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    //return the whole thing in a list form but you not able to sent any list on argument

    static ArrayList<String> subSeqreturn(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqreturn(p + ch, up.substring(1));
        ArrayList<String> right = subSeqreturn(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        subSeq("", "abc");

        
        System.out.println(subSeqreturn("", "abc"));
    }
}
