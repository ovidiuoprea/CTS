package cts.task3.models.ingredients.sauces;

public class FermentingSauce extends Sauce {
    protected Integer expiryHours;

    public FermentingSauce(Integer calories, Boolean isSpicy, Integer expiryHours) {
        super(calories, isSpicy);
        this.expiryHours = expiryHours;
    }
}
