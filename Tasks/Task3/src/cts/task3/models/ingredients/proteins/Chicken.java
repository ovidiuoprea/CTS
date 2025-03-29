package cts.task3.models.ingredients.proteins;

public class Chicken extends Protein {
    private static final Integer CHICKEN_CALORIES = 228;
    private static final Boolean IS_CHICKEN_VEGAN = Boolean.FALSE;

    public Chicken() {
        super(CHICKEN_CALORIES, IS_CHICKEN_VEGAN);
    }
}
