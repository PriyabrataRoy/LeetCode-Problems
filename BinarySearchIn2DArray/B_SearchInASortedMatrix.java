package BinarySearchIn2DArray;

import java.util.Arrays;

public class B_SearchInASortedMatrix {
    public static void main(String as[]){
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 8;
        System.out.println(Arrays.toString(searching(matrix,target)));
    }

    static int[] searching(int[][] arr, int target){
        int row =0;
        int column = arr.length-1;

        while (row<=arr.length-1 && column>=0) {
            if(target == arr[row][column]){
                return new int[]{row,column};
            }
            else if(target>arr[row][column]){
                row++;
            }
            else{
                column--;
            }
        }
            
        
        return new int[]{-1,-1};
    }
}
