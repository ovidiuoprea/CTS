package cts.task3.models.ingredients.wraps;

import cts.task3.models.ingredients.Ingredient;

import java.util.Scanner;

public abstract class Wrap extends Ingredient {
    // If a customer requests flatbread as a wrap, it's disappointing for the business owners
    protected Boolean isDisappointing;

    public Wrap(Integer calories, Boolean isDisappointing) {
        super(calories);
        this.isDisappointing = isDisappointing;
    }

    public static void showSelectWrapSubmenu() {
        System.out.println("Select a wrap:");
        System.out.println("1. Flatbread");
        System.out.println("2. Salad");
        System.out.println("0. No, thanks.");
    }

    public static Wrap getWrapFromUserInput(Scanner in) {
        final int FLATBREAD = 1;
        final int SALAD = 2;
        final int NO_CHOICE = 0;

        showSelectWrapSubmenu();

        int choice = in.nextInt();
        switch (choice) {
            case FLATBREAD:
                return new Flatbread();
            case SALAD:
                return new Salad();
            case NO_CHOICE:
                return null;
            default:
                System.out.println("Input not recognized! Please try again");
                return getWrapFromUserInput(in);
        }
    }
}
