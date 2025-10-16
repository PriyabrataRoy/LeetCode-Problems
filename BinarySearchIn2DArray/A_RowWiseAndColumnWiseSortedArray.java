package BinarySearchIn2DArray;

import java.util.Arrays;

public class A_RowWiseAndColumnWiseSortedArray {

    public static void main(String[] args) {
        int[][] matrix = 
        {
            {10,20,30,40},
            {15,25,35,48},
            {16,28,44,57},
            {20,34,49,60}
        };        
        int target = 16;
        System.out.print(Arrays.toString(findNoInMatrix(matrix, target)));

    }

    static int[] findNoInMatrix(int[][] arr,int target){
        int row = 0;
        int column = arr.length-1;

        while(row<=arr.length-1 && column >= 0){
            if(target == arr[row][column]){
                return new int[]{row,column};
            }
            if(target < arr[row][column]){
                column-- ;
            }
            else if(target > arr[row][column] ){
                row++;
            }
            
        }
        return new int[]{-1,-1};
    }
}
