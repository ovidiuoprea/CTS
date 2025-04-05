package cts.task3.models.singleton;

import cts.task3.models.Kebap;

import java.util.ArrayList;
import java.util.List;

public class KebapManager {
    private static KebapManager instance = new KebapManager();
    private static List<Kebap> kebaps = new ArrayList<>();

    private KebapManager() {
    }

    public static KebapManager getInstance() {
        return instance;
    }

    public void addKebap(Kebap kebap) {
        this.kebaps.add(kebap);
    }

    public List<Kebap> getKebaps() {
        return kebaps;
    }

    public static void deleteKebap(int userChoice) {
        kebaps.remove(userChoice);
    }

    public static void showAllKebaps() {
        for(Kebap kebap : kebaps) {
            System.out.println(kebap);
        }
    }
}
