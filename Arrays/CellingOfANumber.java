//Celling of a no means =  smalest element in the array which is greater than or equal to target
public class CellingOfANumber {
public static int cellingOfaNo(int[] arr,int target){
    if (target > arr[arr.length - 1]) {
    return -1; // no ceiling exists if target value is lerger than last element
}

    int start = 0;
    int end = arr.length-1;

    while(start<=end){
        int mid = start + (end-start)/2;

        if(target==arr[mid]){
            return mid;
        }
      

        if(target>arr[mid]){

            start = mid+1;
        }
        else{
            end = mid -1;
        }
    }
    return start;
}

public static void main(String[] args) {
    int arr[] = {15,18,19,20,22,24,28,45,65,100};
    int target = 50;
    System.out.println(cellingOfaNo(arr, target));
}
}
