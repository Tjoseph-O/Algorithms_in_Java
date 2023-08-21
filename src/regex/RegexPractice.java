package regex;

public class RegexPractice {



    public static boolean findMatch(String text, String pattern) {
        boolean result = text.matches(pattern);
        return result;
    }
}
