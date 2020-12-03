package excercises.excercise_2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas {

    public static Predicate<Integer> hasThreeApples = (n) -> (n == 3);

    public Consumer<String> giveColor() {
        return color -> System.out.println("color is " + color);
    }

    public Function<String, String> makeItLouder() {
        return scream -> scream + "A";
    }

    public Supplier<String> scream() {
        return () -> "AAA";
    }

}
