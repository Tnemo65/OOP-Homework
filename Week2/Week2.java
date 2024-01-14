public class Week4 {
    /**
     * Ham tim max trong 2 so.
     */
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Ham max trong 1 mang.
     */
    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int minNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }

    /**
     * Ham tinh BMI.
     */
    public static String calculateBMI(double weight, double height) {
        // Tinh BMI
        String ans = "";
        double bmi = Math.round((weight / (Math.pow(height, 2)))*10)/10.0;
        if (bmi < 18.5) {
            ans = "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            ans = "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.9) {
            ans = "Thừa cân";
        } else {
            ans = "Béo phì";
        }
        return ans;
    }
}