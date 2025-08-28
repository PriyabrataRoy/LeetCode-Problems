//Floor Of A Number => Means Greatest Element In Array The Which Is Smaller Or Equal To Target
public class FloorOfANumber {
    public static int floorOfANumber(int[] arr,int target){
        if (target<arr[0] ) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            if(target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int arr[] = {32,35,38,40,60,80};
        int target = 40;
        if(floorOfANumber(arr, target) == -1){
            System.out.print("Not Available");
        }
        else{
            System.out.print("Your Floor Of A no Is = "+floorOfANumber(arr, target));
        }
    }
}
