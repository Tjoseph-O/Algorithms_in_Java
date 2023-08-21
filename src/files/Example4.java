package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Example4 {
    public static void main(String[] args) {

        String origin = "/home/joseph/Desktop/UNDONE/Account.java";
        String destination = "/home/joseph/Desktop";
        Path source = Path.of(origin);
        Path dest = Paths.get(destination);

        try {
            Path filepath =  Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);

        }catch (IOException exception){
            exception.printStackTrace();
            System.err.println(exception.getMessage());

        }
    }
}
