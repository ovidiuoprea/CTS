package cts.subject1.models.singleton.registry;

import cts.subject1.exceptions.OvenCountLimitExceededException;
import cts.subject1.models.Dish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Due to the restaurant having more than one oven, this class is singleton registry:
public class Oven {
    public static final int OVEN_COUNT_LIMIT = 4;
    private Integer maximumDegrees;
    private List<Dish> waitingList;

    // Used as a key for the HashMap<>
    private String identifier;

    // This could work with an Integer key - maximumDegrees, but I'm trying to avoid collisions and maximumDegrees is not necessarily unique.
    private static HashMap<String, Oven> instances = new HashMap<>();

    private Oven(int maximumDegrees, String identifier) {
        this.maximumDegrees = maximumDegrees;
        this.waitingList = new ArrayList<>();
        this.identifier = identifier;
    }

    public static Oven getInstance(int maximumDegrees, String identifier) {
        if(instances.size() >= OVEN_COUNT_LIMIT) {
            throw new OvenCountLimitExceededException();
        }
        Oven instance = instances.get(identifier);
        if(instance == null) {
            instance = new Oven(maximumDegrees, identifier);
            instances.put(identifier, instance);
        }
        return instance;
    }
}
