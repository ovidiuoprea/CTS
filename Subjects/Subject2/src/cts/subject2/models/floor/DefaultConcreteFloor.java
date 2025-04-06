package cts.subject2.models.floor;

public class DefaultConcreteFloor extends AFloor{
    public DefaultConcreteFloor() {
        this.hardness = DEFAULT_FLOOR_HARDNESS;
        this.fireHazardLevel = DEFAULT_FLOOR_FIRE_HAZARD_RATING;
    }
}
