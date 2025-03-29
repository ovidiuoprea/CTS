package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Menu implements IMenu {
    protected List<String> options;

    public static final List<String> MAIN_MENU_OPTIONS = Stream.of(
            "Kebap menu",
            "Sauce menu"
    ).toList();

    public static final List<String> KEBAP_MENU_OPTIONS = Stream.of(
            "Create kebap",
            "Delete kebap",
            "Show all kebaps",
            "Filter kebaps"
    ).toList();

    public static final List<String> SAUCE_MENU_OPTIONS = Stream.of(
            "Create sauce",
            "Delete sauce",
            "Save sauces to file",
            "Load sauces from file"
    ).toList();

    public Menu(List<String> options) {
        this.options = options;
    }

    @Override
    public void show() {
        System.out.println("Welcome to \"Kebap nu cu de toate... ci doar cu ce trebuie... SRL\". How can we help?");
        for(String option: options) {
            System.out.println(
                (options.indexOf(option) + 1) +
                ". " +
                option
            );
        }
        System.out.println("0. Go back / exit");
        System.out.println("Choose one: ");
        Scanner in = new Scanner(System.in);
        Integer choice = in.nextInt();
        handleUserInput(choice);
    }

    @Override
    public void handleUserInput(Integer userChoice) {
    }
}
