// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * Ham gcd.
     */
    public static int gcd(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
} 