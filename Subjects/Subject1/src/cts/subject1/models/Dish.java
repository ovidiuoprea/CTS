package cts.subject1.models;

public class Dish {
    String name;
    int cookingTime;
    int cookingDegrees;

    public Dish(String name, int cookingTime, int cookingDegrees) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.cookingDegrees = cookingDegrees;
    }

    public int getCookingTime() {
        return cookingTime;
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
