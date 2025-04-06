import cts.subject2.exceptions.GlassDecorationsNotSupportedException;
import cts.subject2.exceptions.NotEnoughEntrancesException;
import cts.subject2.models.builder.Store;
import cts.subject2.models.builder.StoreBuilder;
import cts.subject2.models.decoration.ADecoration;
import cts.subject2.models.decoration.GlassDecoration;
import cts.subject2.models.decoration.PlasticDecoration;
import cts.subject2.models.decoration.WoodenDecoration;
import cts.subject2.models.floor.SoftFloor;
import cts.subject2.models.floor.WoodenFloor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            Store store = new StoreBuilder("Store 1", 293)
                    .addFloor(new SoftFloor())
                    .addDecoration(new WoodenDecoration("Table"))
                    .addNumberOfEntrances(5)
                    .build();

            System.out.println(store + " " + store.getTotalFireHazardLevel());


            Store store2 = new StoreBuilder("Store 2", 102)
                    .addFloor(new WoodenFloor())
                    .addDecoration((ADecoration) new GlassDecoration("Chandelier"))
                    .build();

            System.out.println(store2 + " " + store2.getTotalFireHazardLevel());

            Store store3 = new StoreBuilder("Store 3", 431)
                    .addFloor(new SoftFloor())
                    .addNumberOfEntrances(6)
                    .addDecoration(new WoodenDecoration("Table"))
                    .addDecoration(new PlasticDecoration("Chairs"))
                    .build();

            System.out.println(store3 + " " + store3.getTotalFireHazardLevel());

            Store store4 = new StoreBuilder("Store 4", 102)
                    .addFloor(new SoftFloor())
                    .addDecoration((ADecoration) new GlassDecoration("Chandelier"))
                    .build();


        }
        catch (GlassDecorationsNotSupportedException |NotEnoughEntrancesException exception) {
            System.out.println("Could not build store due to: " + exception.getMessage());
        }



    }
}