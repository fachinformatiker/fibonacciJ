package app.fachinformatiker.Utility;

public class Debug {
    private static boolean isDebug = true;
    private static boolean isLog = true;

    private Debug() {

    }

    public static void returnInfo(String text) {
        if (isDebug()) {
            System.out.println(text);
        }
    }

    public static void inform(String text) {
        if (isDebug()) {
            returnInfo(text);
        }
        if (isLog()) {
            FileHandler.writeToFile(text);
        }
        System.out.println(text);
    }

    private static boolean isDebug() {
        return isDebug;
    }

    public static void setDebug(boolean isDebug) {
        Debug.isDebug = isDebug;
    }

    private static boolean isLog() {
        return isLog;
    }

    public static void setLog(boolean isLog) {
        Debug.isLog = isLog;
    }
}
