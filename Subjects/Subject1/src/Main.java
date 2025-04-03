import cts.subject1.exceptions.OvenCountLimitExceededException;
import cts.subject1.exceptions.OvenTemperatureExceededException;
import cts.subject1.models.Dish;
import cts.subject1.models.singleton.eager.OvenEager;
import cts.subject1.models.singleton.registry.Oven;

public class Main {
    public static void main(String[] args) {
        Dish pizza = new Dish("Pizza", 25, 200);
        Dish steak = new Dish("Steak", 18, 180);
        Dish pie = new Dish("Pie", 40, 130);
        Dish moussaka = new Dish("Moussaka", 80, 210);

        // Testing oven max temperature:
        Dish burnt = new Dish("Burnt", 300,  900);

        // Requirements 1 & 2:

        // Testing if the singleton is implemented correctly:
        OvenEager oven1 = OvenEager.getInstance();
        OvenEager oven2 = OvenEager.getInstance();

        if(!oven1.equals(oven2)) {
            throw new RuntimeException("Singleton instances are different!");
        }

        oven1.addDishToWaitingList(pizza);
        oven1.addDishToWaitingList(steak);
        oven1.addDishToWaitingList(pie);
        oven1.addDishToWaitingList(moussaka);

        try {
            oven1.addDishToWaitingList(burnt);
        }
        catch(OvenTemperatureExceededException exception) {
            System.out.println("I could not add the dish to the oven's waiting list due to: " + exception.getMessage() + "\n");
        }

        oven1.displayWaitingList();

        // Requirements 3 & 4:

        System.out.println("\nRequirements 3, 4: \n\n");
        Oven registryOven1 = Oven.getInstance(200, "oven1");
        Oven registryOven2 = Oven.getInstance(180, "oven2");
        Oven registryOven3 = Oven.getInstance(400, "oven3");
        Oven registryOven4 = Oven.getInstance(140, "oven4");

        try {
            Oven registryOven5 = Oven.getInstance(300, "oven5");
        }
        catch (OvenCountLimitExceededException exception) {
            System.out.println("Cannot create another oven due to: " + exception.getMessage() + "\n");
        }

        // Testing the singleton registry:
        Oven registryOvenTest1 = Oven.getInstance(200, "oven1");
    }
}