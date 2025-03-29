package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;

import java.util.List;

public class SauceMenu extends Menu implements IMenu {
    public SauceMenu(List<String> options) {
        super(options);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void handleUserInput(Integer userChoice) {
        super.handleUserInput(userChoice);
    }
}
