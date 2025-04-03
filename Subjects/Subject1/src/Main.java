import cts.subject1.exceptions.OvenTemperatureExceededException;
import cts.subject1.models.Dish;
import cts.subject1.models.singleton.eager.SingletonOven;

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
        SingletonOven oven1 = SingletonOven.getInstance();
        SingletonOven oven2 = SingletonOven.getInstance();

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



    }
}