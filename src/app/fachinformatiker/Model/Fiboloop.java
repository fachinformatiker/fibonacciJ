package app.fachinformatiker.Model;

import app.fachinformatiker.Utility.Debug;
import app.fachinformatiker.Utility.FileHandler;
import app.fachinformatiker.constants.constants;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Fiboloop {

    public static int ARG;
    public static double M;
    public static double N;
    public static double FIBONACCI;
    public static double TEMP;
    public static boolean ERROR;
    public static boolean MENU;
    public static boolean TEST;

    public void initialize() {
        ARG = 0;
        M = 1;
        N = 1;
        FIBONACCI = 0;
        TEMP = 0;
        ERROR = false;
        MENU = false;
        TEST = false;

        FileHandler.initializeFile();
    }

    public void startFibonacci(int number) {
        switch (Fiboloop.ARG) {
            case 1:
                FIBONACCI = M;
                System.out.println(FIBONACCI + constants.FIBONACCI_TEXT + ARG);
                FileHandler.writeToFile(FIBONACCI + constants.FIBONACCI_TEXT + ARG);
                break;
            case 2:
                FIBONACCI = N;
                System.out.println(FIBONACCI + constants.FIBONACCI_TEXT + ARG);
                FileHandler.writeToFile(FIBONACCI + constants.FIBONACCI_TEXT + ARG);
                break;
            default:
                for (int i = 3; i <= number; i++) {
                    FIBONACCI = M + N;
                    M = N;
                    N = FIBONACCI;
                    Debug.returnInfo(constants.DEBUG_TEXT + new BigDecimal(FIBONACCI).toPlainString());
                    FileHandler.writeToFile(constants.DEBUG_TEXT + new BigDecimal(FIBONACCI).toPlainString());
                }
                System.out.println(new BigDecimal(FIBONACCI).toPlainString() + constants.FIBONACCI_TEXT + number);
                FileHandler.writeToFile(new BigDecimal(FIBONACCI).toPlainString() + constants.FIBONACCI_TEXT + number);
        }
    }

    public void showMenu() {
        System.out.println(constants.MENU_TITLE);
    }
}
