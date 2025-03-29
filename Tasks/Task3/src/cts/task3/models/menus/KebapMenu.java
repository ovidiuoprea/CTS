package cts.task3.models.menus;

import cts.task3.interfaces.IMenu;
import cts.task3.models.Kebap;
import cts.task3.models.constants.KebapMenuOptionValues;
import cts.task3.models.ingredients.carbohydrates.Carbohydrate;
import cts.task3.models.ingredients.fibers.Fiber;
import cts.task3.models.ingredients.healthy.Healthy;
import cts.task3.models.ingredients.pickles.Pickle;
import cts.task3.models.ingredients.proteins.Chicken;
import cts.task3.models.ingredients.proteins.Falafel;
import cts.task3.models.ingredients.proteins.Lamb;
import cts.task3.models.ingredients.proteins.Protein;
import cts.task3.models.ingredients.wraps.Wrap;

import java.util.List;
import java.util.Scanner;

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
                this.showCreateKebapSubmenu();
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

    private void showCreateKebapSubmenu() {
        Scanner in = new Scanner(System.in);
        Protein protein = Protein.getProteinFromUserInput(in);
        Carbohydrate carbohydrate = Carbohydrate.getCarbohydrateFromUserInput(in);
        Fiber fiber = Fiber.getFiberFromUserInput(in);
        Healthy healthy = Healthy.getHealthyFromUserInput(in);
        Pickle pickle = Pickle.getPickleFromUserInput(in);
        Wrap wrap = Wrap.getWrapFromUserInput(in);

        // TODO: Sauces, needs SauceManager
    }
}

