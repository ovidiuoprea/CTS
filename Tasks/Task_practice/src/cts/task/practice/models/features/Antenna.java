package cts.task.practice.models.features;
import cts.task.practice.abstracts.AFeature;

public class Antenna extends AFeature{
    public String band;

    public Antenna(String name, int price) {
        super(name, price);
        this.band = "5G";
    }

    @Override
    public String toString() {
        return "Antenna{" +
                super.toString() +
                "band='" + band + '\'' +
                '}';
    }
}
