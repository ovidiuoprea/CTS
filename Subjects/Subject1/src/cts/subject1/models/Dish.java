package cts.subject1.models;

public class Dish {
    String name;
    int cookingTime;
    int requiredTemperature;

    public Dish(String name, int cookingTime, int requiredTemperature) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.requiredTemperature = requiredTemperature;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public int getRequiredTemperature() {
        return requiredTemperature;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", cookingTime=" + cookingTime +
                ", cookingDegrees=" + requiredTemperature +
                '}';
    }
}
