package cts.task3.models.ingredients.sauces;

public class Ketchup extends Sauce{
    private static final Integer KETCHUP_CALORIES = 20;
    private static final Boolean IS_KETCHUP_SPICY = true;

    public Ketchup() {
        super(KETCHUP_CALORIES, IS_KETCHUP_SPICY);
    }
}
