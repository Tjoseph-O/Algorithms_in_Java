package files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example3 {
    public static void main(String[] args) {

        String content = """
                public class Account{
                  private String name;
                  private BigDecimal balance;
                  
                  public Account(String name, BigDecimal){
                  this.name;
                  this.balance;
                  
                  }
                }
                
                """;

        String location = "/home/joseph/Desktop/UNDONE/Account.java";
        Path path = Path.of(location);

        try {
           Path filepath =  Files.createTempFile(path, "Account", ".java");
           BufferedWriter writer = Files.newBufferedWriter(filepath);
           writer.write(content);
           writer.close();
        }catch (IOException exception){
            exception.printStackTrace();
            System.err.println(exception.getMessage());

        }
    }
}
