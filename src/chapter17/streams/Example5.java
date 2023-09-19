package chapter17.streams;

import java.util.List;

public class Example5 {

    /*
    this is intermidiate.map
     */
    public static void main(String[] args) {
        List<String> names = List.of(
                "John Doe",
                "Jane Doe",
                "Johnny ",
                "Temitope Joseph"

        );
        // map: x->y also referred to as a transformation operation
        names.stream()
                .map((name) ->name.length())
                .forEach(System.out::println);
    }
}
