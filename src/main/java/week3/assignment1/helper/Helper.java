package week3.assignment1.helper;

public class Helper {
    public static String symbol(int length, String txt) {
        if (length == 0) return "";
        return txt + symbol(--length, txt);
    }
    public static boolean objToBoolean(Object val) {
        return (Boolean) val;
    }
    public static String objToString(Object val) {
        return (String) val;
    }
//    public static <T extends Object> void typeObject(T obj) {
//        if (T instanceof String) return objToString(obj);
//    }
}
