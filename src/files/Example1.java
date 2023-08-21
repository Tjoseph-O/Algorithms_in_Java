package files;

import java.nio.file.Path;

public class Example1 {
    public static void main(String[] args) {
        String location = "/a/b/c/../d/e";
        Path path = Path.of(location);
        System.out.println(path.normalize());
    }
}
