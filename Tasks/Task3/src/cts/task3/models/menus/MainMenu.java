package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;

import java.util.List;

public class MainMenu extends Menu implements IMenu {

    KebapMenu kebapMenu = new KebapMenu(Menu.KEBAP_MENU_OPTIONS);
    SauceMenu sauceMenu = new SauceMenu(Menu.SAUCE_MENU_OPTIONS);

    public MainMenu(List<String> options) {
        super(options);
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void handleUserInput(Integer choice) {
        switch(choice) {
            case 1:
                kebapMenu.show();
            case 2:
                sauceMenu.show();
            case 0:
                break;
            default:
                System.out.println("Invalid option, please try again.");
                this.show();
        }
    }
}

