import cts.subject1.models.Dish;

public class Main {
    public static void main(String[] args) {
        Dish pizza = new Dish("Pizza", 25, 200);
        Dish steak = new Dish("Steak", 18, 180);
        Dish pie = new Dish("Pie", 40, 130);

        System.out.println(pizza);
        System.out.println(steak);
        System.out.println(pie);
    }
}