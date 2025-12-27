package Recursion.ArraysUsingRecursion;

import java.util.ArrayList;

public class C_FindAllIndexOfTargetElement {
    
    static ArrayList<Integer> findAllElement(int[] arr,int target,int i, ArrayList<Integer> list ){
            
         if(i == arr.length){
                return list;
            }        
        if(arr[i] == target){
                list.add(i);
            }
           
            return findAllElement(arr, target, i+1, list);
    }


    public static void main(String[] args) {

        int[] arr ={ 1,2,7,34,5,6,7};

        ArrayList<Integer> ans  = findAllElement(arr, 7, 0, new ArrayList<>());
        System.out.println(ans);
    }
}
