package cts.task3.models.ingredients.fibers;

import cts.task3.models.ingredients.Ingredient;

import java.util.Scanner;

public abstract class Fiber extends Ingredient {
    protected Integer totalFibers;

    public Fiber(Integer calories, Integer totalFibers) {
        super(calories);
        this.totalFibers = totalFibers;
    }

    public static void showSelectFiberSubmenu() {
        System.out.println("Choose a fiber: ");
        System.out.println("1. Cabbage");
        System.out.println("2. Tomato");
        System.out.println("3. Carrot");
        System.out.println("0. No, thanks");
    }

    public static Fiber getFiberFromUserInput(Scanner in) {
        final int CABBAGE = 1;
        final int TOMATO = 2;
        final int CARROT = 3;
        final int NO_CHOICE = 0;

        showSelectFiberSubmenu();

        int choice = in.nextInt();
        switch (choice) {
            case CABBAGE:
                return new Cabbage();
            case TOMATO:
                return new Tomato();
            case CARROT:
                return new Carrot();
            case NO_CHOICE:
                return null;
            default:
                System.out.println("Input not recognized! Please try again");
                return getFiberFromUserInput(in);
        }
    }
}
