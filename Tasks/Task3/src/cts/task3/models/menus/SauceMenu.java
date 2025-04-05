package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;
import cts.task3.models.constants.SauceMenuOptionValues;

import java.util.List;

public class SauceMenu extends Menu implements IMenu {
    public SauceMenu(List<String> options, IMenu parentMenu) {
        super(options, parentMenu);
        if(parentMenu != null) {
            System.out.println("From the sauce menu, parent menu is not null");
        }
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void handleUserInput(Integer userChoice) {
        switch(userChoice) {
            case SauceMenuOptionValues.CREATE:
                //TODO
                break;
            case SauceMenuOptionValues.DELETE:
                //TODO
                break;
            case SauceMenuOptionValues.SERIALIZE:
                //TODO
                break;
            case SauceMenuOptionValues.DESERIALIZE:
                //TODO
                break;
            case SauceMenuOptionValues.BACK:
                parentMenu.show();
                break;
            default:
                this.show();
        }
    }
}
