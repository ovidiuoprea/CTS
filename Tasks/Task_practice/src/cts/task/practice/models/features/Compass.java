package cts.task.practice.models.features;
import cts.task.practice.abstracts.AFeature;

public class Compass extends AFeature {
    int currentDirection;

    public Compass(String name, int price) {
        super(name, price);
        this.currentDirection = 0; // By default, make it point to North.
    }
}
