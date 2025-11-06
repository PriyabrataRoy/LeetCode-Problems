package Sorting;
public class D1_Missing_Number {
    
    public int missingNumber(int[] arr) {
        int i = 0;
        
        // Place each number at its correct index
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        // Find the index where the number doesn't match
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        // If all numbers are in correct position, missing number is n
        return arr.length;
    }

    public static void main(String[] args) {
        D1_Missing_Number obj = new D1_Missing_Number();

        int[] arr1 = {3, 0, 1};
        int[] arr2 = {0, 1};
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Missing number (arr1): " + obj.missingNumber(arr1)); // 2
        System.out.println("Missing number (arr2): " + obj.missingNumber(arr2)); // 2
        System.out.println("Missing number (arr3): " + obj.missingNumber(arr3)); // 8
    }
}


