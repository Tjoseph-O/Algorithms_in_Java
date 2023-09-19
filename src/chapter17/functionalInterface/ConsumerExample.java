package chapter17.functionalInterface;
import java.util.Set;
import java.util.function.Consumer;
public class ConsumerExample {
    public static void main(String[] args) {
        Set<Integer> set = Set.of
                (10,20,30,40,50);
//       Consumer<Integer> consumer = (x)-> System.out.println(x);


        set.forEach(System.out::println);


    }
}
