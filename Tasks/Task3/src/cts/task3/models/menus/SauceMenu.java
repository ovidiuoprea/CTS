package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;

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
            default:
                this.show();
            case 0:
                parentMenu.show();
                break;
        }
    }
}
