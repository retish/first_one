package numeric;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: kristina
 * Date: 3/2/15
 * Time: 12:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class NumbersPrinter {
    public static final String[] oneLines = {
            " * ",
            "** ",
            " * ",
            " * ",
            " * ",
            " * ",
            "***"
    };
    public static final String[] twoLines = {
            " *** ",
            "*   *",
            "*  * ",
            "  *  ",
            " *   ",
            "*    ",
            "*****"
    };
    public static final String[] threeLines = {
            " *** ",
            "*   *",
            "    *",
            "  ** ",
            "    *",
            "*   *",
            " *** "
    };
    public static final String[] foreLines = {
            "    * ",
            "   ** ",
            "  * * ",
            " *  * ",
            "******",
            "    * ",
            "    * "
    };
    public static final String[] fiveLines = {
            "*****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "*   *",
            " *** "
    };

    public static final String[] sixLines = {
            " *** ",
            "*   *",
            "*    ",
            "**** ",
            "*   *",
            "*   *",
            " *** "
    };

    public static final String[] sevenLines = {
            "*****",
            "   * ",
            "  *  ",
            " *   ",
            " *   ",
            " *   ",
            " *   "
    };

    public static final String[] eightLines = {
            " *** ",
            "*   *",
            "*   *",
            " *** ",
            "*   *",
            "*   *",
            " *** "
    };
    public static final String[] nineLines = {
            " *** ",
            "*   *",
            "*   *",
            " **** ",
            "    *",
            "*   *",
            " *** "
    };
    public static final String[] zeroLines = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
    };


    public static final Map<Integer, String[]> numberToPrintingLines = new HashMap() {{
        put(1, oneLines);
        put(2, twoLines);
        put(3, threeLines);
        put(4, foreLines);
        put(5, fiveLines);
        put(6, sixLines);
        put(7, sevenLines);
        put(8, eightLines);
        put(9, nineLines);
        put(0, zeroLines);
    }};

    static void print(int[] numbers) {
        for (int linenumber = 0; linenumber <7; linenumber++){
            for(int i = 0; i < numbers.length; i++){
                System.out.print(numberToPrintingLines.get(i)[linenumber]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
      int nData[];
      nData = new int[10];
      for(int i = 0; i < 10; i++) {
            nData[i] = i;
      }
      print(nData);

    };
}
