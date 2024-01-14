import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Week8Task2 {
    public void nullPointerEx() {
        String s = null;
        int length = s.length();
    }

    public void arrayIndexOutOfBOundsEx() {
        String[] a = new String[3];
        a[10] = "t";
    }

    public void arithmeticEx() {
        int x = 10 / 0;
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader reader = new FileReader("hi.txt");
    }

    public void ioEx() throws IOException {
        FileReader file = new FileReader("kjtgheuekfm.txt");
    }

    /**
     * Check nullpointerException.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không lỗi";
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    /**
     * Check arrayIndexOutOfBoundsException.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBOundsEx();
            return "Không lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * Check arithmeticException.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không lỗi";
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * Check fileNotFoundException.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không lỗi";
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * Check ioException.
     */
    public String ioExTest() {
        try {
            ioEx();
            return "Không lỗi";
        } catch (Exception e) {
            return "Lỗi IO";
        }
    }
}
