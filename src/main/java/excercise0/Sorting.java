package excercise0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        String strs[] = {"sagar", "sonu", "komal"};
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        String result = Arrays.asList(strs).stream().collect(Collectors.joining(", "));
        System.out.print("\nsort based on the length:" + result);

        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        result = Arrays.asList(strs).stream().collect(Collectors.joining(", "));
        System.out.print("\n length based sorting: " + result);

        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });

        result = Arrays.asList(strs).stream().collect(Collectors.joining(", "));
        System.out.print("\n sort based on first char: \n" + result);

        String strsWithE[] = {"sagar", "esonu", "ekomal"};

        Arrays.sort(strsWithE, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.startsWith("e")) return -1; // bring this string forward
                if (o2.startsWith("e")) return 1;
                else
                    return 0;

            }
        });

        result = Arrays.asList(strsWithE).stream().collect(Collectors.joining(", "));
        System.out.print("\n sort based on e presence char: \n" + result);
    }
}