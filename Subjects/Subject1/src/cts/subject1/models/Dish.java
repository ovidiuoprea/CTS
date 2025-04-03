package cts.subject1.models.singleton.eager;

public class Dish {
    String name;
    int cookingTime;
    int cookingDegrees;

    public Dish(String name, int cookingTime, int cookingDegrees) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.cookingDegrees = cookingDegrees;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", cookingTime=" + cookingTime +
                ", cookingDegrees=" + cookingDegrees +
                '}';
    }
}
