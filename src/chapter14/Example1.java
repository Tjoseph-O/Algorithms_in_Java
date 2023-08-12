package chapter14;

public class Example1 {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Java";

        String third = new String("Java");


        System.out.println(first == second);

        System.out.println(third == second);
    }
}
