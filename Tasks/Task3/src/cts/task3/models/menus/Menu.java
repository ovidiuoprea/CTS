package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public abstract class Menu implements IMenu {
    IMenu parentMenu;
    protected List<String> options;

    public static final List<String> MAIN_MENU_OPTIONS_LABELS = Stream.of(
            "Kebap menu",
            "Sauce menu"
    ).toList();

    public static final List<String> KEBAP_MENU_OPTIONS_LABELS = Stream.of(
            "Create kebap",
            "Delete kebap",
            "Show all kebaps",
            "Filter kebaps"
    ).toList();

    public static final List<String> SAUCE_MENU_OPTIONS_LABELS = Stream.of(
            "Create sauce",
            "Delete sauce",
            "Save sauces to file",
            "Load sauces from file"
    ).toList();

    public Menu(List<String> options, IMenu parentMenu) {
        this.options = options;
        this.parentMenu = parentMenu;
    }

    @Override
    public void show() {
        System.out.println("Welcome to \"Kebap nu cu de toate... ci doar cu ce trebuie... SRL\".\nHow can we help?");
        for(String option: options) {
            System.out.println(
                "\t" +
                (options.indexOf(option) + 1) +
                ". " +
                option
            );
        }
        if(this instanceof MainMenu) {
            System.out.println("\t0. Exit");
        }
        else {
            System.out.println("\t0. Go back");
        }
        
        System.out.println("Choose one: ");
        Scanner in = new Scanner(System.in);
        Integer choice = in.nextInt();
        handleUserInput(choice);
    }

    @Override
    public void handleUserInput(Integer userChoice) {
    }
}
