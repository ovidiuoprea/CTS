package cts.task3.models.ingredients.healthy;

public class Radish extends Healthy {
    private static final Integer RADISH_CALORIES = 16;
    private static final String RADISH_PREDOMINANT_VITAMIN = "C";

    public Radish() {
        super(RADISH_CALORIES, RADISH_PREDOMINANT_VITAMIN);
    }
}
