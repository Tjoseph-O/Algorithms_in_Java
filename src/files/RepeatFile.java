package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class RepeatFile {
    public static void main(String[] args) {

        String location = "";
        Path path = Paths.get(location);
        char[] chars = new char[1_000_000];
        try(BufferedReader bufferedReader = Files.newBufferedReader(path)){
            bufferedReader.read(chars);
            System.out.println(Arrays.toString(chars));
//            System.out.println(numberOfBytesRead);
            bufferedReader.close();
        }catch (IOException exception){

        }
        System.out.println(path);
        System.out.println(path.isAbsolute());
    }
}
