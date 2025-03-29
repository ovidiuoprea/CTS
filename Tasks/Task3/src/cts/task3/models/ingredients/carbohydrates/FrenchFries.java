package cts.task3.models.ingredients.carbohydrates;

public class FrenchFries extends Carbohydrate{
    private static final Integer FRENCH_FRIES_CALORIES = 480;
    private static final Integer FRENCH_FRIES_TOTAL_CARBOHYDRATES = 64;

    public FrenchFries(){
        super(FRENCH_FRIES_CALORIES, FRENCH_FRIES_TOTAL_CARBOHYDRATES);
    }
}
