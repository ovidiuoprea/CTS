package cts.task3.models.ingredients.fibers;

import cts.task3.models.ingredients.Ingredient;

public abstract class Fiber extends Ingredient {
    protected Integer totalFibers;

    public Fiber(Integer calories, Integer totalFibers) {
        super(calories);
        this.totalFibers = totalFibers;
    }
}
