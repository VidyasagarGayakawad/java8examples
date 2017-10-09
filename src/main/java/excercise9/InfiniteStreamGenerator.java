package excercise9;

import java.util.Random;
import java.util.stream.DoubleStream;

public class InfiniteStreamGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        //Stream.generate(random::nextInt).limit(10).forEach(System.out::print);
        DoubleStream.generate(random::nextInt).limit(5).forEach(System.out::println);
    }
}
