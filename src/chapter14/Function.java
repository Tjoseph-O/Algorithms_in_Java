package chapter14;

public class Function {
    public static void main(String[] args) {

        System.out.println(compareString("joseph", "john"));


    }

    public static String compareString(String first, String second) {

        StringBuilder words = new StringBuilder(first);
        for (int index = 0; index < words.length(); index++) {
            for (int ind = 0; ind < second.length(); ind++) {
                if (words.charAt(index) == second.charAt(ind)) {
                    words.deleteCharAt(index);
                }

            }
        }
            first = String.valueOf(words);
        return first;

    }


    public static String doubleString(){



        return null;
    };

    public void compareString() {
    }

}
