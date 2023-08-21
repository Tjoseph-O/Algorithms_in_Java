package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example2 {
    public static void main(String[] args) {
        String location = "/home/joseph/Desktop/UNDONE";
        Path path = Path.of(location);

        try {
        Files.createTempFile(path, "joshnick", ".txt");
    }catch (IOException exception){
            exception.printStackTrace();
            System.err.println(exception.getMessage());

        }
    }

}
