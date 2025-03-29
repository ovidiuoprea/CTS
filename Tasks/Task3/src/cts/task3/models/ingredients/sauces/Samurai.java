package cts.task3.models.ingredients.sauces;

public class Samurai extends FermentingSauce{
    private static final Integer SAMURAI_SAUCE_CALORIES = 93;
    private static final Boolean IS_SAMURAI_SAUCE_SPICY = true;
    private static final Integer SAMURAI_SAUCE_EXPIRY_HOURS = 6;

    public Samurai() {
        super(SAMURAI_SAUCE_CALORIES, IS_SAMURAI_SAUCE_SPICY, SAMURAI_SAUCE_EXPIRY_HOURS);
    }
}
