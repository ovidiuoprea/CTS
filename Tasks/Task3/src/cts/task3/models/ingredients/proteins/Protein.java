package cts.task3.models.ingredients.proteins;

import cts.task3.models.ingredients.Ingredient;

import java.util.Scanner;

public abstract class Protein extends Ingredient {
    protected Boolean isVegan;

    public Protein(Integer calories, Boolean isVegan) {
        super(calories);
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return "Protein{" +
                "calories=" + calories +
                ", isVegan=" + isVegan +
                '}';
    }

    public static void showSelectProteinSubmenu() {
        System.out.println("Choose a protein source: ");
        System.out.println("1. Chicken");
        System.out.println("2. Lamb");
        System.out.println("3. Falafel");

    }
    public static Protein getProteinFromUserInput(Scanner in) {
        final int CHICKEN = 1;
        final int LAMB = 2;
        final int FALAFEL = 3;

        Protein.showSelectProteinSubmenu();

        int choice = in.nextInt();

        return switch (choice) {
            case CHICKEN -> new Chicken();
            case LAMB -> new Lamb();
            case FALAFEL -> new Falafel();
            default -> {
                System.out.println("Input not recognized! Please try again");
                yield getProteinFromUserInput(in);
            }
        };
    }
}
