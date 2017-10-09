package excercise9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class RandomIntGenerator {
    public static void main(String[] args) {
        List<Double> doubles = DoubleStream.of(15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9,15,87,95,62,48,52,15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9,15,87,95,62,48,52,15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9,15,87,95,62,48,52,15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9,15,87,95,62,48,52,15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9,15,87,95,62,48,52,15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9,15,87,95,62,48,52,15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9,15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9,15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9,15,87,95,62,48,52,6,5,5,5,5,5,5,5,25,9).limit(10).boxed().collect(Collectors.toList());
        long start = System.currentTimeMillis();
        double result = doubles.stream().map(y-> Math.sqrt(y)).reduce(0.0, (x, y)-> x+y);
        System.out.println(System.currentTimeMillis() - start);
        System.out.print("result :" + result);

        // create a code to generate an infinite stream.

    }
}
