package cts.task3.models.ingredients.healthy;

public class Spinach extends Healthy {
    private static final Integer SPINACH_CALORIES = 23;
    private static final String SPINACH_PREDOMINANT_VITAMIN = "K";

    public Spinach() {
        super(SPINACH_CALORIES, SPINACH_PREDOMINANT_VITAMIN);
    }
}
