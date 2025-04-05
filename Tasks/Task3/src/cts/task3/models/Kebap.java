package cts.task3.models;

import cts.task3.models.ingredients.carbohydrates.Carbohydrate;
import cts.task3.models.ingredients.fibers.Fiber;
import cts.task3.models.ingredients.healthy.Healthy;
import cts.task3.models.ingredients.pickles.Pickle;
import cts.task3.models.ingredients.proteins.Protein;
import cts.task3.models.ingredients.sauces.Sauce;
import cts.task3.models.ingredients.wraps.Wrap;

import java.util.ArrayList;
import java.util.List;

public class Kebap {
    public static final Integer SAUCES_COUNT_LIMIT = 3;
    private Protein protein;
    private Carbohydrate carbohydrate;
    private List<Sauce> sauces = new ArrayList<>();
    private Pickle pickle;
    private Wrap wrap;
    private Fiber fiber;
    private Healthy healthy;

    public Kebap(Protein protein, Carbohydrate carbohydrate) {
        this.protein = protein;
        this.carbohydrate = carbohydrate;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }

    public void setPickle(Pickle pickle) {
        this.pickle = pickle;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public void setFiber(Fiber fiber) {
        this.fiber = fiber;
    }

    public void setHealthy(Healthy healthy) {
        this.healthy = healthy;
    }

    @Override
    public String toString() {
        return "Kebap{" +
                "protein=" + protein +
                ", carbohydrate=" + carbohydrate +
                ", sauces=" + sauces +
                ", pickle=" + pickle +
                ", wrap=" + wrap +
                ", fiber=" + fiber +
                ", healthy=" + healthy +
                '}';
    }
}
