package excercises.excercise_1;

public class Lama {

    private String state = "standing";

    public void performLamaAction(Action action) {

        action.perform();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
