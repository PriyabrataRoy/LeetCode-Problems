// https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
public class Finding_No_On_Infinite_Array {

    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]) {
            start = end+1;          
            int tempend =  (end+1)*2;
            end = tempend+1;
        }
        //    while (target > arr[end]) {
        // int newStart = end + 1;
        // // double the box value
        // end = end + (end - start + 1) * 2;
        // start = newStart;
//}another approch
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end) {
            int mid = start +(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
             if(target<arr[mid]){
                end  = mid-1;
            }
            else{
                start = mid +1;
            }
          
        }
          return -1;
    }
    public static void main(String as[]){
        int arr[] = {2,3,4,5,6,7,8,9,14,56,78,90,95,96,98,100};
        int target = 100;
        System.out.println(target+" Found At "+ans(arr,target)+" Index");
    }
}
