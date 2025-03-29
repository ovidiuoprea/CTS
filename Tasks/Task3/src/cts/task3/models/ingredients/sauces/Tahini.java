package cts.task3.models.ingredients.sauces;

public class Tahini extends Sauce{
    private static final Integer TAHINI_CALORIES = 90;
    private static final Boolean IS_TAHINI_SPICY = false;

    public Tahini() {
        super(TAHINI_CALORIES, IS_TAHINI_SPICY);
    }
}
