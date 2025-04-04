package cts.subject1.models.singleton.registry;

import cts.subject1.exceptions.OvenCountLimitExceededException;
import cts.subject1.models.Dish;

import java.util.*;

// Due to the restaurant having more than one oven, this class is singleton registry:
public class Oven {
    public static final int OVEN_COUNT_LIMIT = 4;
    private Integer maximumTemperature;
    private List<Dish> waitingList;

    // Used as a key for the HashMap<>
    private String identifier;

    // This could work with an Integer key - maximumDegrees, but I'm trying to avoid collisions and maximumDegrees is not necessarily unique.
    private static HashMap<String, Oven> instances = new HashMap<>();

    private Oven(int maximumTemperature, String identifier) {
        this.maximumTemperature = maximumTemperature;
        this.waitingList = new ArrayList<>();
        this.identifier = identifier;
    }

    public static Oven getInstance(int maximumDegrees, String identifier) {
        Oven instance = instances.get(identifier);

        if(instance == null) {
            // If adding a new oven will exceed the oven count limit, throw exception
            if(instances.size() >= OVEN_COUNT_LIMIT) {
                throw new OvenCountLimitExceededException();
            }

            instance = new Oven(maximumDegrees, identifier);
            instances.put(identifier, instance);
            System.out.println("Created a new " + instance);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "maximumDegrees=" + maximumTemperature +
                ", waitingList=\n" + waitingList +
                ", identifier='" + identifier + '\'' +
                '}';
    }

    // We're not breaking singleton here, as we're just filtering the instances.

    /**
     * Get a map of ovens with maximumTemperature >= given required temperature
     * Not breaking singleton, as it's only filtering already-existing instances, not creating new ones
     * @param requiredTemperature - given required temperature
     * @return map of eligible ovens || empty map if no ovens are eligible
     */
    public static HashMap<String, Oven> getEligibleOvens(int requiredTemperature) {
        HashMap<String, Oven> eligibleOvens = new HashMap<>();
        for(String key : instances.keySet()) {
            if(instances.get(key).maximumTemperature >= requiredTemperature) {
                eligibleOvens.put(key, instances.get(key));
            }
        }
        return eligibleOvens;
    }

    /**
     * Get the total waiting time for a given oven, computed as the sum of cooking times for all the dishes in the oven's waiting list.
     * @param oven - given oven
     * @return total waiting time || 0 if the oven has no dishes.
     */
    public static int getTotalWaitingTime(Oven oven) {
        if(oven.waitingList.isEmpty()) {
            return 0;
        }

        int totalWaitingTime = 0;
        for(Dish dish : oven.waitingList) {
            totalWaitingTime += dish.getCookingTime();
        }
        return totalWaitingTime;
    }

    /**
     * Get the optimal oven ( with the lowest waiting time ) for a given map of ovens
     * @param ovens - list of
     * @return Optimal oven - oven with the lowest waiting time
     */
    public static Oven getOptimalOven (HashMap<String, Oven> ovens) {
        String firstKey = ovens.keySet().stream().findFirst().get();
        Oven optimal = ovens.get(firstKey);

        for(String key : ovens.keySet()) {
            int waitingTime = getTotalWaitingTime(ovens.get(key));

            if(waitingTime < getTotalWaitingTime(optimal)) {
                optimal = ovens.get(key);
            }
        }

        return optimal;
    }

    /**
     * Adds the given dish to the eligible oven with the lowest waiting time
     * eligible oven = oven with
     * @param dish
     */
    public static void addDish(Dish dish) {

        HashMap<String, Oven> eligibleOvens = getEligibleOvens(dish.getRequiredTemperature());
        Oven optimalOven = getOptimalOven(eligibleOvens);
        optimalOven.waitingList.add(dish);
    }

    public static void displayOvens() {
        for(String key : instances.keySet()) {
            System.out.println(key + ": " + instances.get(key).toString());
        }
    }
}
