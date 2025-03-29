package cts.task3.models.ingredients;

public abstract class Ingredient {
    protected Integer calories;

    public Ingredient(Integer calories) {
        this.calories = calories;
    }
}
