package cts.subject2.models.decoration;

public abstract class ADecoration {
    protected String name;
    protected int fireHazardLevel;

    public ADecoration(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ADecoration{" +
                "name='" + name + '\'' +
                ", fireHazardLevel=" + fireHazardLevel +
                '}';
    }
}
