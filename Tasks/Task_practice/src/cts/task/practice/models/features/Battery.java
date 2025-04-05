package cts.task.practice.models.features;
import cts.task.practice.abstracts.AFeature;

public class Battery extends AFeature{
    private int capacity;

    public Battery(String name, int price) {
        super(name, price);
        this.capacity = 1000;
    }

    @Override
    public String toString() {
        return "Battery{" +
                super.toString() +
                "capacity=" + capacity +
                '}';
    }
}
