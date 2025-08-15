import java.util.Scanner;

public class Find_Numbers_With_Even_NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

    
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

      
        Find_Numbers_With_Even_NumberOfDigits obj = new Find_Numbers_With_Even_NumberOfDigits();
        int result = obj.findNumbers(nums);

        System.out.println("Count of numbers with even digits: " + result);

        sc.close();
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            int n = nums[i];
            while (n > 0) {
                temp++;
                n = n / 10;
            }
            if (temp % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
