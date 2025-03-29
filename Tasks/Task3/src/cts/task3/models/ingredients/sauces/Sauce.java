package cts.task3.models.ingredients.sauces;

import cts.task3.models.ingredients.Ingredient;

public abstract class Sauce extends Ingredient {
    protected Boolean isSpicy;

    public Sauce(Integer calories, Boolean isSpicy) {
        super(calories);
        this.isSpicy = isSpicy;
    }
}
