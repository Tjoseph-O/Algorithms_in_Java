package chapter_two;

public class SquaresCubes {
    public static void main(String[] args) {
        square(1);
        cube(1);
    }

    static void square(int n){
        int result = n * n;
        System.out.println("The Square is : " + result);
    }
    static void cube(int n){
        int outCome = n * n * n;
        System.out.println("The Cube is : " + outCome);
    }
}

