package cts.task3.models.ingredients.carbohydrates;

public class Rice extends Carbohydrate {
    private static final Integer RICE_CALORIES = 235;
    private static final Integer RICE_TOTAL_CARBOHYDRATES = 48;

    public Rice() {
        super(RICE_CALORIES, RICE_TOTAL_CARBOHYDRATES);
    }
}
