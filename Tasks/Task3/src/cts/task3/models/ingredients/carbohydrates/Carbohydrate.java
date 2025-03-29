package cts.task3.models.ingredients.carbohydrates;

import cts.task3.models.ingredients.Ingredient;

public abstract class Carbohydrate extends Ingredient {
    private Integer totalCarbohydrates;

    public Carbohydrate(Integer calories, Integer totalCarbohydrates) {
        super(calories);
        this.totalCarbohydrates = totalCarbohydrates;
    }
}
