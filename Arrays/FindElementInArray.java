import java.util.Scanner;

public class FindElementInArray {
    public static void FindElementsInArray(int arr[], int search) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                c++;
                System.out.println(search + " found at index " + i);
            }
        }
        if (c == 0) {
            System.out.println("-1");
        }
    }
 
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter The Array Length = ");
        int n = ob.nextInt();
        int arr[] = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter The No. = ");
            arr[i] = ob.nextInt();
        }

        System.out.print("Enter The No You Want To Search = ");
        int search = ob.nextInt();
        FindElementsInArray(arr, search);
    }
}
