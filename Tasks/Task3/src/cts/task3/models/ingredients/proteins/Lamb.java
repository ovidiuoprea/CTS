package cts.task3.models.ingredients.proteins;

public class Lamb extends Protein {
    private final static Integer LAMB_CALORIES = 389;
    private final static Boolean IS_LAMB_VEGAN = false;

    public Lamb() {
        super(LAMB_CALORIES, IS_LAMB_VEGAN);
    }
}
