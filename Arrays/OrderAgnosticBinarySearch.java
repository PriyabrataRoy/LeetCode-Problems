public class OrderAgnosticBinarySearch {
    public static int binarySearch(int arr[], int target){

        int start=0;
        int end = arr.length-1;
        boolean asc = arr[start]<arr[end];
        while(start<=end){
            int mid =start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if (asc) {//if array was in ascending order
              if (target>arr[mid]) {
                start = mid+1;               
            }
            else{
                end = mid-1;
            }  
            }

            else {//if array was in descending order

                if (target<arr[mid]) {
                start = mid+1;               
            }
            else{
                end = mid-1;
            }
            }
        }
        return -1;

    }
    public static void main(String as[]){
       // int arr[] = {2,3,4,5,6,7,8};
       int arr[] = {8,7,5,4,3,2};
        
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }
}
