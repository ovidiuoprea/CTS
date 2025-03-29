package cts.task3.models.ingredients.proteins;

public class Falafel extends Protein{
    private static final Integer FALAFEL_CALORIES = 332;
    private static final Boolean IS_FALAFEL_VEGAN = Boolean.TRUE;

    public Falafel() {
        super(FALAFEL_CALORIES, IS_FALAFEL_VEGAN);
    }
}
