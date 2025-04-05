package cts.task.practice.abstracts;

public abstract class AFeature {
    String name;
    int price;

    public AFeature(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", price=" + price + ", ";
    }
}
