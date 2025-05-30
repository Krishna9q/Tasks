
import java.util.Scanner;

public class program2MaximumPathSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {{12, 22, 5, 0, 20, 18},
        {0, 2, 5, 25, 18, 17},
        {12, 10, 5, 4, 2, 1}
        };

        // Calculate and print the maximum path sum
        System.out.println(getMaxPathSum(matrix, matrix.length, matrix[0].length));

        sc.close();
    }

    private static int getMaxPathSum(int[][] matrix, int n, int m) {
        int[][] dp = new int[n][m];

        // Initialize the first row of dp
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Fill dp array using the 3 possible moves
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int down = dp[i - 1][j];
                int leftDiagonal = (j > 0) ? dp[i - 1][j - 1] : 0;
                int rightDiagonal = (j < m - 1) ? dp[i - 1][j + 1] : 0;

                dp[i][j] = matrix[i][j] + Math.max(down, Math.max(leftDiagonal, rightDiagonal));
            }
        }

        // Find the maximum in the last row
        int maxSum = 0;
        for (int j = 0; j < m; j++) {
            maxSum = Math.max(maxSum, dp[n - 1][j]);
        }

        return maxSum;
    }
}
