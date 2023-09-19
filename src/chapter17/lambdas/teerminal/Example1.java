package chapter17.lambdas.teerminal;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(
                10,9,7,11,5,3, 1, 2, -5
        );
        List<Integer> list = numbers.stream()
                                    .sorted(Comparator.reverseOrder())
                                    .toList();

        System.out.println(list);

    }
}
