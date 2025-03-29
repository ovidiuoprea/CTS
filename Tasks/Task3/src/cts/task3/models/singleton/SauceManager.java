package cts.task3.models.singleton;

import cts.task3.models.ingredients.sauces.Sauce;

import java.util.ArrayList;
import java.util.List;

public class SauceManager {
    private static final SauceManager instance = new SauceManager();
    private List<Sauce> sauces = new ArrayList<Sauce>();

    private SauceManager() {}

    public static SauceManager getInstance() {
        return instance;
    }

    public void addSauce(Sauce sauce) {
        sauces.add(sauce);
    }

    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }
    public List<Sauce> getSauces() {
        return sauces;
    }

    public static void showAllSauces() {
        SauceManager sauceManager = SauceManager.getInstance();
        List<Sauce> sauces = sauceManager.getSauces();

        for(int i=0; i<sauces.size(); i++) {
            System.out.println(i+1 + ". " + sauces.get(i).toString());
        }
    }
}
