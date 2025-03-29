import cts.task3.models.ingredients.Ingredient;
import cts.task3.models.ingredients.proteins.Chicken;
import cts.task3.models.ingredients.proteins.Falafel;
import cts.task3.models.ingredients.proteins.Lamb;

public class Main {
    public static void main(String[] args) {
        Ingredient chicken = new Chicken();
        Ingredient lamb = new Lamb();
        Ingredient falafel = new Falafel();

        System.out.println(chicken);
        System.out.println(lamb);
        System.out.println(falafel);
    }
}