import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Java template for competitive programming
 *
 * @author Man Parvesh Singh Randhawa
 */
public class Main {
    private static BufferedReader bufferedReader;
    private static PrintWriter out;
    private static final String SPACE = " ";

    /**
     * Initializes private variables
     *
     * @throws Exception
     */
    private static void init() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
    }

    /**
     * The end of execution
     */
    private static void end() throws IOException {
        bufferedReader.close();
        out.close();
    }

    private static void println(String s) {
        out.println(s);
    }

    private static void println(int i) {
        out.println(i);
    }

    private static void println() {
        out.println();
    }

    private static void println(double d) {
        out.println(d);
    }

    private static void print(String s) {
        out.print(s);
    }

    private static void print(int i) {
        out.print(i);
    }

    private static void print(double d) {
        out.print(d);
    }

    /**
     * Reads line and returns as String
     *
     * @return
     * @throws Exception
     */
    private static String readLine() throws IOException {
        return bufferedReader.readLine();
    }

    private static int singleIntegerInput() throws IOException {
        return Integer.parseInt(readLine());
    }

    private static double singleDoubleInput() throws IOException {
        return Double.parseDouble(readLine());
    }

    private static long singleLongInput() throws IOException {
        return Long.parseLong(readLine());
    }

    private static String singleStringInput() throws IOException {
        return readLine().trim();
    }

    /**
     * Takes input from line and split using space character as delimiter
     *
     * @return
     * @throws Exception
     */
    private static String[] readLineAndSplitIntoArray() throws IOException {
        return readLine().split(" ");
    }

    /**
     * Takes int array of length n as input from a line
     *
     * @param n
     * @return
     * @throws Exception
     */
    private static int[] arrayIntegerInput(int n) throws IOException {
        String sar[] = readLineAndSplitIntoArray();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(sar[i]);
        }
        return ar;
    }

    private static long[] arrayLongInput(int n) throws IOException {
        String sar[] = readLineAndSplitIntoArray();
        long ar[] = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Long.parseLong(sar[i]);
        }
        return ar;
    }

    private static double[] arrayDoubleInput(int n) throws IOException {
        String sar[] = readLineAndSplitIntoArray();
        double ar[] = new double[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Double.parseDouble(sar[i]);
        }
        return ar;
    }

    private static String[] arrayStringInput(int n) throws IOException {
        return readLineAndSplitIntoArray();
    }

    private void run() throws IOException {
        // main code
    }

    public static void main(String[] args) throws IOException {
        init();

        Main main = new Main();
        main.run();

        end();
    }
}
