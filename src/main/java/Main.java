import excercises.excercise_1.Action;
import excercises.excercise_1.Lama;

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
                lama.setState("sitting");
                System.out.println("lama is now " + lama.getState());
            }
        });
    }

}
