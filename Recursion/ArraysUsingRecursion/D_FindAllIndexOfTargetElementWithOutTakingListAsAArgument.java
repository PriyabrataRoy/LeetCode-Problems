package Recursion.ArraysUsingRecursion;

import java.util.ArrayList;

public class D_FindAllIndexOfTargetElementWithOutTakingListAsAArgument {
    
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length){
            return list;
        }
       
        //This will contain ans for that function call only
        if (arr[i] == target){
            list.add(i);
        }

        ArrayList<Integer> ans = findAllIndex(arr, target, i+1);
         list.addAll(ans);
         return list;
        
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4};
        ArrayList<Integer>  ans = findAllIndex(arr, 4, 0);
        System.out.println(ans);
    }
}

/*Note:
Think like this:

Each function call creates its own list

That list stores only its own answer

Recursive call returns its answer

You merge them
*/