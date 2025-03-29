package cts.task3.models.ingredients.sauces;

import cts.task3.models.ingredients.Ingredient;
import cts.task3.models.singleton.SauceManager;

import java.util.List;
import java.util.Scanner;

public abstract class Sauce extends Ingredient {
    protected Boolean isSpicy;
    protected String name;

    public Sauce(Integer calories, String name,Boolean isSpicy) {
        super(calories);
        this.name = name;
        this.isSpicy = isSpicy;
    }

    public Boolean getSpicy() {
        return isSpicy;
    }

    public String getName() {
        return name;
    }



    public static Sauce getSauceFromUserInput(Scanner in) {
        SauceManager.showAllSauces();
        int choice = in.nextInt();
        Sauce sauce = SauceManager
                .getInstance()
                .getSauces()
                .get(choice);
        return sauce;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "isSpicy=" + isSpicy +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
