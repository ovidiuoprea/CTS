package cts.task3.models.builders;

import cts.task3.exceptions.SauceBeforeProteinException;
import cts.task3.exceptions.TooManySaucesException;
import cts.task3.interfaces.IBuilder;
import cts.task3.models.Kebap;
import cts.task3.models.ingredients.carbohydrates.Carbohydrate;
import cts.task3.models.ingredients.fibers.Fiber;
import cts.task3.models.ingredients.healthy.Healthy;
import cts.task3.models.ingredients.pickles.Pickle;
import cts.task3.models.ingredients.proteins.Protein;
import cts.task3.models.ingredients.sauces.Sauce;
import cts.task3.models.ingredients.wraps.Wrap;

import java.util.List;

public class KebapBuilder implements IBuilder {
    private Kebap kebap;

    public KebapBuilder(Protein protein, Carbohydrate carbohydrate) {
        kebap = new Kebap(protein, carbohydrate);
    }

    public KebapBuilder setSauces(List<Sauce> sauces) {
        if(kebap.getProtein() == null) {
            throw new SauceBeforeProteinException();
        }
        if(sauces.size() >= Kebap.SAUCES_COUNT_LIMIT) {
            throw new TooManySaucesException();
        }
        kebap.setSauces(sauces);
        return this;
    }

    public KebapBuilder setPickle(Pickle pickle) {
        kebap.setPickle(pickle);
        return this;
    }

    public KebapBuilder setWrap(Wrap wrap) {
        kebap.setWrap(wrap);
        return this;
    }

    public KebapBuilder setFiber(Fiber fiber) {
        kebap.setFiber(fiber);
        return this;
    }

    public KebapBuilder setHealthy(Healthy healthy) {
        kebap.setHealthy(healthy);
        return this;
    }

    @Override
    public Kebap build() {
        return kebap;
    }
}
