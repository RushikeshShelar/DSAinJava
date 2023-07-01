import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
         int[][] matrix = {
            {10,20,30,40},
            {50,60,70,80},
            {85,89,90,120},
            {121,135,152,180}
        };
        int target = 180;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (col == 0){
            return new int[] {-1,-1};
        }
        if (row == 1)
            return binarySearch(matrix, 0, 0, col - 1, target);
            
        int rowStart = 0;
        int rowEnd = row - 1;
        int colMid = col / 2;
        while (rowStart < (rowEnd - 1)) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[rowMid][colMid] == target)
                return new int[] { rowMid, colMid };
            
            if (matrix[rowMid][colMid] < target) {
                rowStart = rowMid;
            } else {
                rowEnd = rowMid;
            }
        }
        // checking in the middle of reduced two rows
        if (matrix[rowStart][colMid] == target)
            return new int[] { rowStart, colMid };
        else if (matrix[rowStart + 1][colMid] == target)
            return new int[] { rowStart + 1, colMid };

        //Checking in the remaining halfs
        // First Half
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }
        // Second Half
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][col - 1]) {
            return binarySearch(matrix, rowStart, colMid + 1, col - 1, target);
        }
        // Third Half
        if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
        }
        // Forth Half
        else{
            return binarySearch(matrix, rowStart + 1 , colMid + 1, col - 1, target);
        }

    }

    // Search int the row and Column provided
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            } 
            if (matrix[row][mid] > target) {
                colEnd = mid - 1;
            } else {
                colStart = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
