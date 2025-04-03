package cts.subject1.models.singleton.eager;
import cts.subject1.exceptions.OvenTemperatureExceededException;
import cts.subject1.models.Dish;

import java.util.ArrayList;
import java.util.List;

public class SingletonOven {

    private static final SingletonOven instance = new SingletonOven();
    private int maximumDegrees;
    private List<Dish> waitingList;

    private SingletonOven() {
        this.maximumDegrees = 270;
        this.waitingList = new ArrayList<Dish>();
    }

    public static SingletonOven getInstance() {
        return instance;
    }

    public void addDishToWaitingList(Dish dish) {
        System.out.println("Adding " + dish + " to the oven's waiting list...");
        if(dish.getCookingTime() > this.maximumDegrees) {
            throw new OvenTemperatureExceededException();
        }
        this.waitingList.add(dish);
        System.out.println("Added " + dish + " to the oven's waiting list\n");
    }

    public void displayWaitingList() {
        if(!this.waitingList.isEmpty()) {
            System.out.println("Oven waiting list:");
            for(Dish dish : this.waitingList) {
                System.out.println(dish);
            }
        }
    }
}
