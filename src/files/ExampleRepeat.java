package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ExampleRepeat {
        public static void main(String[] args) {

            String location = "";
            Path path = Paths.get(location);


            try(BufferedReader bufferedReader = Files.newBufferedReader(path)){
               String line =  bufferedReader.readLine();
                System.out.println(line);

            }catch (IOException exception){
                System.err.println(exception.getMessage());

            }

        }
    }


