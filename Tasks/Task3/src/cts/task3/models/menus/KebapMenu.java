package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;
import cts.task3.models.Kebap;
import cts.task3.models.constants.KebapMenuOptionValues;

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
            case KebapMenuOptionValues.CREATE:
                // TODO
                break;
            case KebapMenuOptionValues.DELETE:
                // TODO
                break;
            case KebapMenuOptionValues.SHOW_ALL:
                // TODO
                break;
            case KebapMenuOptionValues.FILTER:
                // TODO
                break;
            case KebapMenuOptionValues.BACK:
                parentMenu.show();
                break;
            default:
                this.show();
                break;
        }
    }
}

