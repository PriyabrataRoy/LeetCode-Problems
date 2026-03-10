package Recursion.String;


import java.util.*;

public class E_Subset_Iterative_Duplicate_Elements {
    public static void main(String[] args) {
        int[] arr = {2,1,2,4,3,4};
        Arrays.sort(arr);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        int  end =0;
        for(int i = 0;i<arr.length;i++){
            
            int start =0;
            //if you found any duplicate element start from new created subsets
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;

            }
            end = subsets.size()-1;

            for(int j=start ; j<=end; j++){
                List<Integer> newSubset = new ArrayList<>(subsets.get(j));
                newSubset.add(arr[i]);
                subsets.add(newSubset);
            }
        }

        System.out.println(subsets);
          
}
}
