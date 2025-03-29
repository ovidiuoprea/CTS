package cts.task3.models.ingredients.proteins;

import cts.task3.models.ingredients.Ingredient;

public abstract class Protein extends Ingredient {
    protected Boolean isVegan;

    public Protein(Integer calories, Boolean isVegan) {
        super(calories);
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return "Protein{" +
                "calories=" + calories +
                ", isVegan=" + isVegan +
                '}';
    }
}
