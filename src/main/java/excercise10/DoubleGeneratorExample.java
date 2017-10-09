package excercise10;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class DoubleGeneratorExample {

    public static void main(String[] args) {

        /*
        Make a static method that, given a size, will produce a List<Double> of that size, each value of
        which is a random number between 0 and 1. Use Math.random() and normal List methods.
        */
        buildDoubles(4).stream().forEach(System.out::println);

        /* Make a static method that, given a List<Double>, will output the average. Use normal List methods.
            (You can also use Stream methods if you can figure out how to turn a List<Double> into a
            DoubleStream.)*/
        double average = buildDoubles(5).stream().mapToDouble(x -> x.intValue()).average().getAsDouble();
        System.out.print(average);

        /*Make a static method that, given a List<Double> and a cutoff, will modify the List so that all numbers
        below the cutoff are removed. Use one of the methods from this lecture.*/

        System.out.print("doubles are filtered out in this way:");
        remove(10, buildDoubles(5)).stream().forEach(System.out::print);



    }

    public static List<Double> buildDoubles(int howMany) {
        return DoubleStream.generate(Math::random).limit(howMany).boxed().collect(Collectors.toList());
    }

    private static List<Double> remove(int cutOff, List<Double> list) {
        return list.stream().filter(x -> x < cutOff).collect(Collectors.toList());
    }
}