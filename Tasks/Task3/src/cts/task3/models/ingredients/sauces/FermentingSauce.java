package cts.task3.models.ingredients.sauces;

public class FermentingSauce extends Sauce {
    protected Integer expiryHours;

    public FermentingSauce(Integer calories, String name, Boolean isSpicy, Integer expiryHours) {
        super(calories, name, isSpicy);
        this.expiryHours = expiryHours;
    }
}
