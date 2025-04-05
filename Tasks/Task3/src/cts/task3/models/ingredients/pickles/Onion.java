package cts.task3.models.ingredients.pickles;

public class Onion extends Pickle {
    private static final Integer ONION_CALORIES = 15;
    private static final Boolean IS_ONION_SPICY = Boolean.TRUE;

    public Onion() {
        super(ONION_CALORIES, IS_ONION_SPICY);
    }
}
