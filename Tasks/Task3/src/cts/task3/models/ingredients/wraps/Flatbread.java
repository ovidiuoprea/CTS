package cts.task3.models.ingredients.wraps;

public class Flatbread extends Wrap{
    private static final Integer FLATBREAD_CALORIES = 234;
    private static final Boolean IS_FLATBREAD_DISAPPOINTING = Boolean.TRUE;

    public Flatbread() {
        super(FLATBREAD_CALORIES, IS_FLATBREAD_DISAPPOINTING);
    }
}
