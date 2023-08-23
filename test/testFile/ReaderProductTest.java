package testFile;

import org.junit.jupiter.api.Test;
import task.ReaderProduct;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderProductTest {
    @Test
    public void testUpdateProduct(){
        String products = ReaderProduct.readProduct();
        String patch = """
                  {
                    "name": "Bible",
                    "price": "50000",
                    "quantity": "200",
                    "id": "09",
                    "branch": "Osun"
                    
                    },
                
                """;

        ReaderProduct.updateProduct(5, patch);
        assertEquals();
    }


    private void getProduct(){}
}
