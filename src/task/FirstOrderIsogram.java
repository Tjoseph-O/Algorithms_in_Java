package task;

import java.util.Arrays;

public class FirstOrderIsogram {

    public static void main(String[] args) {
        String pass = "A_.BCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(checkForIsogram(pass));
    }



    static boolean checkForIsogram(String input){
        input = input.toLowerCase();
        int length = input.length();

        char arr[] = input.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < length - 1; i++){
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
}
