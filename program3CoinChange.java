
public class program3CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int target = 5;
        int ways = countWays(coins, target);
        System.out.println("Number of ways to make " + target + " is: " + ways);
    }



    // Function to count combinations to form 'target' using coins
    private static int countWays(int[] coins, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1; // Base case: 1 way to form sum 0

        for (int coin : coins) {
            for (int amount = coin; amount <= target; amount++) {
                dp[amount] += dp[amount - coin];
            }
        }

        return dp[target];
    }
}
