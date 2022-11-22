package mfxcore.utils;

@SuppressWarnings("unused")
public final class Repeater {
    public static String repeat(Character c, int numberOfTimes) {
        if (c == null) return "";
        return new String(new char[numberOfTimes]).replace('\0', c);
    }

    public static String repeat(String s, int numberOfTimes) {
        if (s == null) return "";
        char c = s.toCharArray()[0];
        return repeat(c, numberOfTimes);
    }
}
