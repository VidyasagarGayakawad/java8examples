package excercise2;

import java.util.ArrayList;
import java.util.function.Function;

public class MethodReferenceExamples {
    /*method1(x, y, d -> Math.cos(d));
someList.forEach(entry -> System.out.println(entry));
    method2(a, b, c, (d1,d2) -> Math.pow(d1,d2));
someStream.reduce(0, (i1,i2) -> Integer.sum(i1, i2));
    method3(foo, bar, (a,b,c) -> Utils.doSomethingWith(a,b,c));
    method4(() -> Math.random());*/

    public static double method1(double x, Function<Double, Double> cosineFunction) {
        System.out.print("Input x has cos(x): " + cosineFunction.apply(x));
        return cosineFunction.apply(x);
    }

    public static void main(String[] args) {
        double result = method1(10, Math::cos);
        System.out.print("Input x has cos(x): " + result);

        ArrayList<String> someList = new ArrayList<>(3);
        someList.add("hello");
        someList.add("sagar");
        someList.add("sonu");
        someList.forEach(System.out::print);


    }



}
