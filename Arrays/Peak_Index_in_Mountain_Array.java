
public class Peak_Index_in_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid; // Peak is at mid or before
            } else {
                start = mid + 1; // Peak is after mid
            }
        }
        return start; // or end (both are same here)
    }

    public static void main(String[] args) {
        Peak_Index_in_Mountain_Array obj = new Peak_Index_in_Mountain_Array();
        
        int[] arr = {0, 2, 5, 3, 1};  
        int peakIndex = obj.peakIndexInMountainArray(arr);
        
        System.out.println("Peak Index: " + peakIndex);
        System.out.println("Peak Value: " + arr[peakIndex]);
    }
}
