package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;

import java.util.List;

public class KebapMenu extends Menu implements IMenu {
    public KebapMenu(List<String> options, IMenu parentMenu) {
        super(options, parentMenu);
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
                break;
            case 0:
                parentMenu.show();
                break;
        }
    }
}

