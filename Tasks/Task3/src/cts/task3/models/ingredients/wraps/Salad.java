package cts.task3.models.ingredients.wraps;

public class Salad extends Wrap{
    private static final Integer SALAD_CALORIES = 6;
    private static final Boolean IS_SALAD_DISAPPOINTING = Boolean.FALSE;

    public Salad() {
        super(SALAD_CALORIES, IS_SALAD_DISAPPOINTING);
    }
}
