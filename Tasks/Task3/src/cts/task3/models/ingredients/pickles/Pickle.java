package cts.task3.models.ingredients.pickles;

import cts.task3.models.ingredients.Ingredient;

public abstract class Pickle extends Ingredient {
    private Boolean isSpicy;

    public Pickle(Integer calories, Boolean isSpicy) {
        super(calories);
        this.isSpicy = isSpicy;
    }
}
