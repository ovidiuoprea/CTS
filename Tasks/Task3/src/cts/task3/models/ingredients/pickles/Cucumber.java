package cts.task3.models.ingredients.pickles;

public class Cucumber extends Pickle {
    private static final Integer CUCUMBER_CALORIES = 8;
    private static final Boolean IS_CUCUMBER_SPICY = Boolean.FALSE;

    public Cucumber() {
        super(CUCUMBER_CALORIES, IS_CUCUMBER_SPICY);
    }
}
