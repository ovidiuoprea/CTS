package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;

import java.util.List;

public class MainMenu extends Menu implements IMenu {

    private KebapMenu kebapMenu;
    private SauceMenu sauceMenu;

    public MainMenu(List<String> options, IMenu parentMenu) {
        super(options, parentMenu);
        kebapMenu = new KebapMenu(Menu.KEBAP_MENU_OPTIONS_LABELS, this);
        sauceMenu = new SauceMenu(Menu.SAUCE_MENU_OPTIONS_LABELS, this);
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
                break;
            case 2:
                sauceMenu.show();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid option, please try again.");
                this.show();
        }
    }
}

