import chapter14.Function;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionTest {


    Function function;

    @BeforeEach
    void setUp(){function = new Function();}

    @Test public void objectExit(){assertNotNull(function);}

    @Test public void testing_forTwoString(){
       function.compareString();


    }




}
