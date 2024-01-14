public class Numeral extends Expression {
    private double value;

    public Numeral() {
    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String ans = String.valueOf((int) this.value);
        return ans;
    }

    @Override
    public double evaluate() {
        return Double.valueOf(this.value).intValue();
    }

}