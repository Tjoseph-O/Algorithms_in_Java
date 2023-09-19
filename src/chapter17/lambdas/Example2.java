package chapter17.lambdas;

public class Example2 {
    public static void main(String[] args) {
        Animal animal1 = (steps)->{
          return  "I am a Man taking " +steps+" steps";
        };
        System.out.println(animal1.move(2000));
    }
}
