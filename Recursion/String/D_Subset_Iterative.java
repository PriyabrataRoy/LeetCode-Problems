package Recursion.String;

import java.util.ArrayList;
import java.util.List;

public class D_Subset_Iterative {
    static List<List<Integer>> Subset(int[] arr)    {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for(int num : arr){
            int size = subsets.size();
            for(int i =0;i<size;i++){
                List<Integer> newSubset = new  ArrayList<>(subsets.get(i));
                newSubset.add(num);
                subsets.add(newSubset);
            }
        }
        return subsets;
    }

    public static void main(String args[]){
        int[] arr = {1,2,3};
        System.out.println(Subset(arr));
    }

   /*   public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // empty subset

        for (int num : arr) {
            int size = subsets.size();

            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(subsets.get(i));
                newSubset.add(num);
                subsets.add(newSubset);
            }
        }

        System.out.println(subsets);
    }
        */ 
}
