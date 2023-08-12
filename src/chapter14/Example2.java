package chapter14;

import java.nio.charset.Charset;

public class Example2 {
    public static void main(String[] args) {
        byte[] bytes = {65, 66, 67, 68, 69, 70};

        String str = new String(bytes, 2, 4, Charset.defaultCharset());
        System.out.println(str);
    }
}
