package app.fachinformatiker.Utility;

public class Debug {
    private static boolean isDebug = true;

    private Debug() {

    }

    public static void returnInfo(String text) {
        if (isDebug()) {
            System.out.println(text);
        }
    }

    private static boolean isDebug() {
        return isDebug;
    }

    public static void setDebug(boolean isDebug) {
        Debug.isDebug = isDebug;
    }
}
