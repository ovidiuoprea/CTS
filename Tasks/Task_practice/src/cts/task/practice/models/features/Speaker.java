package cts.task.practice.models.features;
import cts.task.practice.abstracts.AFeature;

public class Speaker extends AFeature {
    private int power;

    public Speaker(String name, int price) {
        super(name, price);
        this.power = 60;
    }
}
