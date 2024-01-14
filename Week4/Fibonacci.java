// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * Ham Fibonacci.
     */
    public static long fibonacci(long n) {
        long res = 0;
        if (n < 0) {
            res = -1;
        } else if (n == 0) {
            res = 0;
        } else if (n == 1) {
            res = 1;
        } else {
            long ans = 0;
            long fi1 = 0;
            long fi2 = 1;
            for (long i = 2; i <= n; i++) {
                ans = fi1 + fi2;
                if (ans < 0) {
                    return Long.MAX_VALUE;
                }
                fi1 = fi2;
                fi2 = ans;
            }
            res = ans;
        }
        return res;
    }
}  