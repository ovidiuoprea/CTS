package cts.task3.models.ingredients.wraps;

import cts.task3.models.ingredients.Ingredient;

public abstract class Wrap extends Ingredient {
    // If a customer requests flatbread as a wrap, it's disappointing for the business owners
    protected Boolean isDisappointing;

    public Wrap(Integer calories, Boolean isDisappointing) {
        super(calories);
        this.isDisappointing = isDisappointing;
    }
}
