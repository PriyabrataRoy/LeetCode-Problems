package Recursion.ArraysUsingRecursion;

public class E_RotatedSortedArrayBinarySearch {
   static int search(int[] arr, int target, int start, int end) {

    if (start > end) return -1;

    int mid = start + (end - start) / 2;

    if (arr[mid] == target) return mid;

    // Duplicate handling
    if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
        return search(arr, target, start + 1, end - 1);
    }

    // Left half sorted
    if (arr[start] <= arr[mid]) {
        if (target >= arr[start] && target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        } else {
            return search(arr, target, mid + 1, end);
        }
    }
    // Right half sorted
    else {
        if (target > arr[mid] && target <= arr[end]) {
            return search(arr, target, mid + 1, end);
        } else {
            return search(arr, target, start, mid - 1);
        }
    }
}


    public static void main(String[] args) {
        int arr[] = {5,6,7,8,1,2,3,4};
        int target = 0;

        int ans = search(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }
}
