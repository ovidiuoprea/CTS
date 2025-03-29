package cts.task3.models.ingredients.sauces;

public class Tzatziki extends FermentingSauce{
    private static final Integer TZATZIKI_CALORIES = 13;
    private static final Boolean IS_TZATZIKI_SPICY = false;
    private static final Integer TZATZIKI_EXPIRY_HOURS = 8;

    public Tzatziki() {
        super(TZATZIKI_CALORIES, IS_TZATZIKI_SPICY, TZATZIKI_EXPIRY_HOURS);
    }
}
