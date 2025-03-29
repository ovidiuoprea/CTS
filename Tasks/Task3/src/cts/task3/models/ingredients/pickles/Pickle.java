package cts.task3.models.ingredients.pickles;

import cts.task3.models.ingredients.Ingredient;

import java.util.Scanner;

public abstract class Pickle extends Ingredient {
    private Boolean isSpicy;

    public Pickle(Integer calories, Boolean isSpicy) {
        super(calories);
        this.isSpicy = isSpicy;
    }

    public static void showSelectPickleSubmenu() {
        System.out.println("Choose a pickle:");
        System.out.println("1. Cucumber");
        System.out.println("2. Onion");
        System.out.println("0. No, thanks.");
    }

    public static Pickle getPickleFromUserInput(Scanner in) {
        final int CUCUMBER = 1;
        final int ONION = 2;
        final int NO_CHOICE = 0;

        showSelectPickleSubmenu();

        int choice = in.nextInt();
        switch (choice) {
            case CUCUMBER:
                return new Cucumber();
            case ONION:
                return new Onion();
            case NO_CHOICE:
                return null;
            default:
                System.out.println("Input not recognized! Please try again");
                return getPickleFromUserInput(in);
        }
    }
}
