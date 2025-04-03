package cts.subject1.models.singleton.eager;
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
}
