package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;

import java.util.List;

public class KebapMenu extends Menu implements IMenu {
    public KebapMenu(List<String> options) {
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

