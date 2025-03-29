package cts.task3.models.ingredients.sauces;

import cts.task3.models.ingredients.Ingredient;

public abstract class Sauce extends Ingredient {
    protected Boolean isSpicy;
    protected String name;

    public Sauce(Integer calories, String name,Boolean isSpicy) {
        super(calories);
        this.name = name;
        this.isSpicy = isSpicy;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "isSpicy=" + isSpicy +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
