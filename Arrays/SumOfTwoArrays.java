import java.util.Scanner;
import java.util.Arrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter The 1st Array Range = ");
        int n1 = ob.nextInt();
        System.out.print("Enter The 2nd Array Range = ");
        int n2 = ob.nextInt();

        // Input of 1st Array
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter The No. For 1st Array = ");
            arr1[i] = ob.nextInt();
        }

        // Input of 2nd Array
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter The No. For 2nd Array = ");
            arr2[i] = ob.nextInt();
        }

        // Calculation
        int carry = 0;
        int maxlength = (n1 > n2) ? n1 : n2;
        int[] sum = new int[maxlength + 1];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int s = carry;
            if (i >= 0) {
                s += arr1[i];
            }
            if (j >= 0) {
                s += arr2[j];
            }
            carry = s / 10;
            sum[k] = s % 10;

            i--;
            j--;
            k--;
        }

        // Print arrays
        System.out.println("Your 1st Array = " + Arrays.toString(arr1));
        System.out.println("Your 2nd Array = " + Arrays.toString(arr2));

       
        System.out.print("Sum Of Array Is = ");
        int start = (sum[0] == 0) ? 1 : 0;
        for (int idx = start; idx < sum.length; idx++) {
            System.out.print(sum[idx]);
        }
        System.out.println();
    }
}
