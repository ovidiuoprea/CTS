package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;
import cts.task3.models.constants.MenuOptionLabels;
import cts.task3.models.constants.MainMenuOptionValues;

import java.util.List;

public class MainMenu extends Menu implements IMenu {

    private KebapMenu kebapMenu;
    private SauceMenu sauceMenu;

    public MainMenu(List<String> options, IMenu parentMenu) {
        super(options, parentMenu);
        kebapMenu = new KebapMenu(MenuOptionLabels.KEBAP_MENU_OPTIONS_LABELS, this);
        sauceMenu = new SauceMenu(MenuOptionLabels.SAUCE_MENU_OPTIONS_LABELS, this);
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
            case MainMenuOptionValues.KEBAP_MENU:
                kebapMenu.show();
                break;
            case MainMenuOptionValues.SAUCE_MENU:
                sauceMenu.show();
                break;
            case MainMenuOptionValues.EXIT:
                break;
            default:
                System.out.println("Invalid option, please try again.");
                this.show();
        }
    }
}

