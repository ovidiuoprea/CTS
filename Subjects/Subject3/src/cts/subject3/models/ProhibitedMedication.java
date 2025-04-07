package cts.subject3.models;

public class ProhibitedMedication {
    private String name;
    private float limit;

    public ProhibitedMedication(String name, float limit) {
        this.name = name;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public float getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "ProhibitedMedication{" +
                "name='" + name + '\'' +
                ", limit=" + limit +
                '}';
    }
}
