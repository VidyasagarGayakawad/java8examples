package excercise0;

import java.util.Arrays;
import java.util.List;

public class ListUtils {
    public static void main(String[] args) {
        String str = lastEntry(Arrays.asList("sagar", "sonu"));
        System.out.print(str);
        Integer nums[] = {1, 2, 3};
        int lastNumber = lastEntry(nums);
        System.out.print(lastNumber);
    }

    public static <T> T lastEntry(List<T> elements) {
        return elements.get(elements.size() - 1);
    }

    public static <T> T lastEntry(T[] elements) {
        return elements[elements.length - 1];
    }
}