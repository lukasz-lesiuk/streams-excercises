import excercises.excercise_1.Action;
import excercises.excercise_1.Lama;
import excercises.excercise_2.Lambdas;

import java.util.function.Predicate;


public class Main {

    public static void main(String[] args) {
        Lama lama = new Lama();

        lama.performLamaAction(new Action() {
            @Override
            public void perform() {
                System.out.println("spit");
            }
        });

        lama.performLamaAction(new Action() {
            @Override
            public void perform() {
                lama.setStanding(false);
                System.out.println("lama is now standing <- this statement is now " + lama.isStanding());
            }
        });

        System.out.println("Lama has 3 apples < this is " + Lambdas.hasThreeApples.test(lama.getLamaApples()));

    }
}
