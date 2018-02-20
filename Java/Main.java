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

    /**
     * Parses int from String
     *
     * @param s
     * @return
     */
    private static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    private static void println(String s) {
        out.println(s);
    }

    private static void println(int i) {
        out.println(i);
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

    /**
     * Takes single int input in a line
     *
     * @return
     * @throws Exception
     */
    private static int singleIntInput() throws IOException {
        return parseInt(readLine());
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
    private static int[] intArrayInputFromLine(int n) throws IOException {
        String sar[] = readLineAndSplitIntoArray();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = parseInt(sar[i]);
        }
        return ar;
    }

    public static void main(String[] args) throws IOException {
        init();

        // main code

        end();
    }
}
