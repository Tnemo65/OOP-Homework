// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    private int numerator;
    private int denominator = 1;

    /**
     * Ham getNumerator.
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * Ham getDenominator.
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * Ham setNumerator.
     */
    public void setNumerator(int n) {
        this.numerator = n;
    }

    /**
     * Ham setDenominator.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Hàm khởi tạo đầy đủ.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Hàm khởi tạo mặc định.
     */
    public Solution() {

    }

    /**
     * Hàm tìm UCLN.
     */
    public int gcd(int a, int b) {
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

    /**
     * Hàm tìm BCNN.
     */
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     * Hàm tối giản phân số.
     */
    public Solution reduce() {
        int temp = gcd(this.numerator, this.denominator);
        this.numerator /= temp;
        this.denominator /= temp;
        return this;
    }

    /**
     * Hàm cộng phân số.
     */
    public Solution add(Solution other) {
        int temp = lcm(this.denominator, other.denominator);
        this.numerator = this.numerator * temp / this.denominator;
        other.setNumerator(other.numerator * temp / other.denominator);
        this.denominator = temp;
        other.setDenominator(temp);
        this.numerator = this.numerator + other.getNumerator();
        Solution ans = new Solution(this.numerator, this.denominator);
        return ans.reduce();
    }

    /**
     * Hàm trừ phân số.
     */
    public Solution subtract(Solution other) {
        int temp = lcm(this.denominator, other.denominator);
        this.numerator = this.numerator * temp / this.denominator;
        other.setNumerator(other.numerator * temp / other.denominator);
        this.denominator = temp;
        other.setDenominator(temp);
        this.numerator = this.numerator - other.getNumerator();
        Solution ans = new Solution(this.numerator, this.denominator);
        return ans.reduce();
    }

    /**
     * Hàm nhân phân số.
     */
    public Solution multiply(Solution other) {
        this.numerator *= other.getNumerator();
        this.denominator *= other.getDenominator();
        Solution ans = new Solution(this.numerator, this.denominator);
        return ans.reduce();
    }

    /**
     * Hàm chia phân số.
     */
    public Solution divide(Solution other) {
        this.numerator *= other.getDenominator();
        this.denominator *= other.getNumerator();
        Solution ans = new Solution(this.numerator, this.denominator);
        return ans.reduce();
    }

    /**
     * Hàm kiểm tra xem 2 phân số có bằng nhau.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            int check1 = this.numerator * other.getDenominator();
            int check2 = this.denominator * other.getNumerator();
            if (check1 == check2) {
                return true;
            }
        }
        return false;
    }

} 