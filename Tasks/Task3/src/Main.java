import cts.task3.exceptions.SauceBeforeProteinException;
import cts.task3.exceptions.TooManySaucesException;
import cts.task3.models.Kebap;
import cts.task3.models.KebapBuilder;
import cts.task3.models.ingredients.Ingredient;
import cts.task3.models.ingredients.carbohydrates.FrenchFries;
import cts.task3.models.ingredients.carbohydrates.Rice;
import cts.task3.models.ingredients.fibers.Cabbage;
import cts.task3.models.ingredients.fibers.Tomato;
import cts.task3.models.ingredients.healthy.Radish;
import cts.task3.models.ingredients.proteins.Chicken;
import cts.task3.models.ingredients.proteins.Falafel;
import cts.task3.models.ingredients.proteins.Lamb;
import cts.task3.models.ingredients.sauces.FermentingSauce;
import cts.task3.models.ingredients.sauces.NonFermentingSauce;
import cts.task3.models.ingredients.wraps.Flatbread;
import cts.task3.models.ingredients.sauces.Sauce;
import cts.task3.models.menus.MainMenu;
import cts.task3.models.menus.Menu;
import cts.task3.serializers.SauceSerializer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Ingredient chicken = new Chicken();
        Ingredient lamb = new Lamb();
        Ingredient falafel = new Falafel();

        System.out.println(chicken);
        System.out.println(lamb);
        System.out.println(falafel);

        Kebap k1 = new KebapBuilder(new Chicken(), new Rice()).build();

        Kebap k2 = new KebapBuilder(new Lamb(), new FrenchFries())
            .setFiber(new Tomato())
            .setHealthy(new Radish())
            .setWrap(new Flatbread()).build();

        Kebap k3 = new KebapBuilder(new Chicken(), new FrenchFries())
            .setSauces(Stream.of(new NonFermentingSauce(200, "ketchup", false)).collect(Collectors.toList()))
            .build();

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);

        // Sauce before protein exception:
        try {
            Kebap k4 = new KebapBuilder(null, null)
                    .setSauces(Stream.of(new NonFermentingSauce(200, "ketchup", false)).collect(Collectors.toList()))
                    .build();
        }
        catch(SauceBeforeProteinException exception) {
            System.out.println(exception.getMessage());
        }

        Sauce ketchup = new NonFermentingSauce(300, "Ketcup", false);
        Sauce chilli = new NonFermentingSauce(200, "Chilli", true);
        Sauce mayonnaise = new FermentingSauce(360, "Mayonnaise", false, 6);
        Sauce spicyMayonnaise = new FermentingSauce(365, "Spicy mayonnaise", true, 6);

        // Too many sauces exception:
        try {
            Kebap k5 = new KebapBuilder(new Chicken(), new Rice())
                    .setSauces(Stream.of(ketchup, chilli, mayonnaise, spicyMayonnaise).collect(Collectors.toList()))
                    .setFiber(new Cabbage())
                    .setWrap(new Flatbread())
                    .build();
        }
        catch (TooManySaucesException exception) {
            System.out.println(exception.getMessage());
        }

        List<Sauce> sauces = Stream.of(ketchup, chilli, mayonnaise, spicyMayonnaise).toList();
        SauceSerializer.write(sauces, "output/sauces.txt");
        SauceSerializer.read("output/sauces.txt");

        List<Sauce> readSauces = SauceSerializer.read("output/sauces.txt");
        for(Sauce sauce: readSauces) {
            System.out.println(sauce);
        }

        Menu mainMenu = new MainMenu(Menu.MAIN_MENU_OPTIONS_LABELS, null);
        mainMenu.show();
    }
}