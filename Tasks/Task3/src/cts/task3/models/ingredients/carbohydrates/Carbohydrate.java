package cts.task3.models.ingredients.carbohydrates;

import cts.task3.models.ingredients.Ingredient;

import java.util.Scanner;

public abstract class Carbohydrate extends Ingredient {
    private Integer totalCarbohydrates;

    public Carbohydrate(Integer calories, Integer totalCarbohydrates) {
        super(calories);
        this.totalCarbohydrates = totalCarbohydrates;
    }

    public static void showSelectCarbohydrateSubmenu() {
        System.out.println("Choose a carbohydrates source:");
        System.out.println("1. French Fries");
        System.out.println("2. Rice");
    }

    public static Carbohydrate getCarbohydrateFromUserInput(Scanner in) {
        final int FRENCH_FRIES = 1;
        final int RICE = 2;

        showSelectCarbohydrateSubmenu();
        int choice = in.nextInt();

        switch (choice) {
            case FRENCH_FRIES:
                return new FrenchFries();
            case RICE:
                return new Rice();
            default:
                System.out.println("Input not recognized! Please try again");
                return getCarbohydrateFromUserInput(in);
        }
    }
}
