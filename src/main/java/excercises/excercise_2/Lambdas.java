package excercises.excercise_2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas {

    public static Predicate<Integer> hasThreeApples = (n) -> (n == 3);

    public static Predicate<Integer> hasThreeApples2() {
        return (n) -> (n == 3);
    }

    public static Consumer<String> giveColor() {
        return color -> System.out.println("color is " + color);
    }

    public static Function<String, String> makeItLouder() {
        return scream -> scream + "A";
    }

    public static Function<Integer, Integer> makeItBigger() {
        return n -> n + 1;
    }

    public static Supplier<String> scream() {
        return () -> "AAA";
    }

}
