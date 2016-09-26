import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Java template for competitive programming
 * @author Man Parvesh Singh Randhawa
 */
class Main{
    private static BufferedReader br;
    private static PrintWriter out;

    /**
     * Initializes private variables
     * @throws Exception
     */
    private static void init(){
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
    }

    /**
     * The end of execution
     */
    private static void end(){
        out.close();
    }

    /**
     * Parses int from String
     * @param s
     * @return
     */
    private static int pint(String s){
        return Integer.parseInt(s);
    }

    /**
     * Parses double from String
     * @param s
     * @return
     */
    private static double pdo(String s){
        return Double.parseDouble(s);
    }

    /**
     * Reads line and returns as String
     * @return
     * @throws Exception
     */
    private static String rl() throws Exception{
        return br.readLine();
    }

    /**
     * Takes single int input in a line
     * @return
     * @throws Exception
     */
    private static int inIntLn() throws Exception{
        return pint(rl());
    }

    /**
     * Takes input from line and split using space character as delimiter
     * @return
     * @throws Exception
     */
    private static String[] sarSpl() throws Exception{
        return rl().split(" ");
    }

    /**
     * Takes int array of length n as input from a line
     * @param n
     * @return
     * @throws Exception
     */
    private static int[] inIntAr(int n) throws Exception{
        String sar[] = sarSpl();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
        	ar[i] = pint(sar[i]);
        }
        return ar;
    }

    /**
     * Takes double array of length n as input from a line
     * @param n
     * @return
     * @throws Exception
     */
    private static double[] inDoAr(int n) throws Exception{
        String sar[] = sarSpl();
        double ar[] = new double[n];
        for(int i=0;i<n;i++){
        	ar[i] = pdo(sar[i]);
        }
        return ar;
    }

    /**
     * Where you enter your magic
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception{
        init();

        //Main code

        end();
    }
}
