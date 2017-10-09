package excercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListTrasformerExample {
    public static void main(String[] args) {
        List<String> inputCollection = new ArrayList<>(1);
        inputCollection.add("hell");
        inputCollection.add("sagar");
        inputCollection.add("sonu");

        List<String> result = trasformList(inputCollection, x -> x + "!");
        result.forEach(System.out::print);

        result = trasformList(inputCollection, String::toUpperCase);
        result.forEach(System.out::print);

    }

    public static List<String> trasformList(List<String> inputCollection, Function<String, String> trasform) {
        List<String> result = new ArrayList<>(1);
        for (String str : inputCollection) {
            result.add(trasform.apply(str));
        }
        return result;
    }
}
