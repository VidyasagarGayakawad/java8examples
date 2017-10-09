package excercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ListTrasformerExampleGeneric {
    public static void main(String[] args) {
        List<String> inputCollection = new ArrayList<>(1);
        inputCollection.add("hell");
        inputCollection.add("sagar");
        inputCollection.add("sonu");

        List<String> result = trasformList(inputCollection, x -> x + "!");
        result.forEach(System.out::print);

        result = trasformList(inputCollection, String::toUpperCase);
        result.forEach(System.out::print);

        List<Integer> ints = trasformList(Arrays.asList(1, 2, 2, 5), x -> x * x);
        ints.forEach(System.out::print);

    }

    public static <T> List<T> trasformList(List<T> inputCollection, Function<T, T> trasform) {
        List<T> result = new ArrayList<>(1);
        for (T str : inputCollection) {
            result.add(trasform.apply(str));
        }
        return result;
    }
}
