package cts.subject1.models.singleton.registry;

import cts.subject1.models.Dish;

import java.util.List;

// Due to the restaurant having more than one oven, this class is not a singleton anymore.
public class Oven {
    private int maximumDegrees;
    private List<Dish> waitingList;

    public Oven(int maximumDegrees, List<Dish> waitingList) {
        this.maximumDegrees = maximumDegrees;
        this.waitingList = waitingList;
    }
}
