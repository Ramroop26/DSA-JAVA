public class FibonacciSeries {
    static int fibo(int n, int dp[]) {
       if (n <= 1) return n;        // base case
       if (dp[n] != -1) return dp[n];  // already stored
        dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp) + fibo(n-3,dp); // store result
        return dp[n];
    }
      public static void main(String[] args) {
        int n = 6;                
        int dp[] = new int[n + 1];
                                      // fill dp with -1
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        System.out.println(fibo(n, dp));
    }
}
