package cts.task3.models.ingredients.healthy;

import cts.task3.models.ingredients.Ingredient;

public abstract class Healthy extends Ingredient {
    private String predominantVitamin;

    public Healthy(Integer calories, String predominantVitamin) {
        super(calories);
        this.predominantVitamin = predominantVitamin;
    }
}
