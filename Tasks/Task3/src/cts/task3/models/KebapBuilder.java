package cts.task3.models;

import cts.task3.interfaces.IBuilder;
import cts.task3.models.ingredients.carbohydrates.Carbohydrate;
import cts.task3.models.ingredients.proteins.Protein;

public class KebapBuilder implements IBuilder {
    private Kebap kebap;

    public KebapBuilder(Protein protein, Carbohydrate carbohydrate) {
        kebap = new Kebap(protein, carbohydrate);
    }

    @Override
    public Kebap build() {
        return kebap;
    }
}
