package LinearSearch;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,4,5},
                {7,8,10},
                {16,100,999}
        };
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(arr[i][j] > max){
                   max = arr[i][j];
               }
            }
        }
        return max;
    }
}