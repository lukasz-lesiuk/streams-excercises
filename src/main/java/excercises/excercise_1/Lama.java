package excercises.excercise_1;

public class Lama {

    private boolean standing = true;
    private String color = "grey";
    private int lamaApples = 3;

    public void performLamaAction(Action action) {

        action.perform();
    }

    public boolean isStanding() {
        return standing;
    }

    public void setStanding(boolean standing) {
        this.standing = standing;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLamaApples() {
        return lamaApples;
    }

    public void setLamaApples(int lamaApples) {
        this.lamaApples = lamaApples;
    }
}
