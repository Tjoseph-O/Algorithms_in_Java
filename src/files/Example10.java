package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example10 {
    public static void main(String[] args) {
        String location = "/home/joseph/Desktop/files/";
        Path path = Paths.get(location);

        try(var paths = Files.newDirectoryStream(path)){
            paths.forEach(System.out::println);
        }catch (IOException exception){

        }
    }
}
