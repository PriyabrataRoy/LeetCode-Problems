public class Search_In_Rotated_Sorted_Array_With_Duplicate_Elements {
    public static int search(int[] arr,int target){
        int pivot = find_pivot(arr);

        // pivot == target
        if(pivot != -1 && arr[pivot] == target){ // if i not write this pivot != -1 when pivot is -1 and try to check pivot[-1] == target it throws an exception
            return pivot;
        }

        //if pivot is -1
        
        if(pivot == -1){
            
           return binary_search(target, arr, 0, arr.length-1);
        }

        // if target is greater than  arr[0]
        if(target >= arr[0]){
            return binary_search(target, arr, 0 , pivot-1);
        }
        return binary_search(target, arr, pivot+1 , arr.length-1);
    }
    public static int find_pivot(int[] arr){
        int start = 0, end = arr.length-1;
       
        while(start<=end){
            int mid = start + ( end-start )/2;

            if( mid <end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            else if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(start<end && arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if (end>start && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }

            else if (arr[start]>arr[mid]) {
                end = mid-1;
            }
            else{
                start  = mid +1;
            }
        }
        return -1;
    }

    public static int binary_search (int target, int[] arr,int start, int end ){

        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }

            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return -1;
    }

    public static void main (String as[]){
        // 1. Normal rotated array without duplicates
       int[] arr1 = {4,5,6,7,0,1,2};
       System.out.println(search(arr1, 0)); // 4
       System.out.println(search(arr1, 3)); // -1
        
       // 2. Rotated array with duplicates
        int[] arr2 = {2,2,2,9,2,2,2};
        System.out.println(search(arr2, 9)); // 3
        System.out.println(search(arr2, 2)); // could be 0,1,2,4,5,6 (any index of 2)
        System.out.println(search(arr2, 5)); // -1

        // 3. Pivot at the end
        int[] arr3 = {2,2,2,2,2,0,2};
        System.out.println(search(arr3, 0)); // 5

       // 4. Pivot at the start
        int[] arr4 = {9,0,1,2,3,4,5};
        System.out.println(search(arr4, 9)); // 0
        System.out.println(search(arr4, 5)); // 6

       // 5. Not rotated (sorted array)
        int[] arr5 = {1,2,3,4,5,6,7};
        System.out.println(search(arr5, 3)); // 2
        System.out.println(search(arr5, 7)); // 6
        System.out.println(search(arr5, 8)); // -1
       
         // 6. All duplicates
        int[] arr6 = {2,2,2,2,2,2,2};
        System.out.println(search(arr6, 2)); // any index (0–6)
        System.out.println(search(arr6, 3)); // -1

        
        // 7. Small arrays
        int[] arr7 = {1};
        System.out.println(search(arr7, 1)); // 0
        System.out.println(search(arr7, 2)); // -1

        int[] arr8 = {2,1};
        System.out.println(search(arr8, 1)); // 1
        System.out.println(search(arr8, 2)); // 0

          // 8. Example tricky case
        int[] arr9 = {2,2,9,0,2,2,2};
        System.out.println(search(arr9, 9)); // 2
        System.out.println(search(arr9, 0)); // 3

    }
}
