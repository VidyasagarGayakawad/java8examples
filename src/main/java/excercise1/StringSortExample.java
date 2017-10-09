package excercise1;

import java.util.Arrays;

public class StringSortExample {
    public static void main(String[] args) {
        String str[] = {"hello", "hi", "elephant", "good", "bad", "egg"};
        //sort strings based on their length
        Arrays.sort(str, (x, y) -> x.length() - y.length());
        System.out.print("\n" + Arrays.toString(str));

        //sort strings based on their length but in reverse order
        Arrays.sort(str, (x, y) -> y.length() - x.length());
        System.out.print("\n" + Arrays.toString(str));

        //sort strings based on first char of strings
        Arrays.sort(str, (x, y) -> x.charAt(0) - y.charAt(0));
        System.out.print("\n" + Arrays.toString(str));

        //sort strings based on occurrence of 'e'
        Arrays.sort(str, (x, y) -> x.startsWith("e") ? -1 : y.startsWith("e") ? 1 : 0);
        System.out.print("\n" + Arrays.toString(str));

        //sort strings based on occurrence of 'e'
        Arrays.sort(str, (x, y) -> Utils.compareStringsByOccuranceOfE(x, y));
        System.out.print("\n" + Arrays.toString(str));

        //sort strings based on occurrence of 'e'
        Arrays.sort(str, Utils::compareStringsByOccuranceOfE);
        System.out.print("\n" + Arrays.toString(str));
    }
}

class Utils {
    // remove ternary operator and put if else logic for simplicity
    public static int compareStringsByOccuranceOfE(String x, String y) {
        return x.startsWith("e") ? -1 : y.startsWith("e") ? 1 : 0;
    }
}