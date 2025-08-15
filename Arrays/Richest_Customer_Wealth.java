import java.util.Scanner;

public class Richest_Customer_Wealth {
      public int maximumWealth(int[][] accounts) {
        int arr[] = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            arr[i] = sum;
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int m = sc.nextInt();
        System.out.print("Enter number of banks per customer: ");
        int n = sc.nextInt();

        int[][] accounts = new int[m][n];
        System.out.println("Enter wealth values (customer rows):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        Richest_Customer_Wealth sol = new Richest_Customer_Wealth();
        int result = sol.maximumWealth(accounts);
        System.out.println("Maximum wealth: " + result);
        
        sc.close();
    }
}
