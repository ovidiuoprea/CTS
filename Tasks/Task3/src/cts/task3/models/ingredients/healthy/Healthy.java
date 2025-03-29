package cts.task3.models.ingredients.healthy;

import cts.task3.models.ingredients.Ingredient;

import java.util.Scanner;

public abstract class Healthy extends Ingredient {
    private String predominantVitamin;

    public Healthy(Integer calories, String predominantVitamin) {
        super(calories);
        this.predominantVitamin = predominantVitamin;
    }

    public static void showSelectHealthySubMenu() {
        System.out.println("✨ Healthy ✨");
        System.out.println("1. Radish");
        System.out.println("2. Spinach");
        System.out.println("0. No, thanks.");
    }

    public static Healthy getHealthyFromUserInput(Scanner in) {
        final int RADISH = 1;
        final int SPINACH = 2;
        final int NO_CHOICE = 0;

        showSelectHealthySubMenu();

        int choice = in.nextInt();
        switch (choice) {
            case RADISH:
                return new Radish();
            case SPINACH:
                return new Spinach();
            case NO_CHOICE:
                return null;
            default:
                return getHealthyFromUserInput(in);
        }
    }
}
