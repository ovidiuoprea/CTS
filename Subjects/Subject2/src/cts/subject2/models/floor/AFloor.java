package cts.subject2.models.floor;

public abstract class AFloor {
    protected int hardness;
    protected int fireHazardLevel;

    public static final int DEFAULT_FLOOR_HARDNESS = 5;
    public static final int DEFAULT_FLOOR_FIRE_HAZARD_RATING = 2;

    public AFloor() {
    }

    public int getFireHazardLevel() {
        return fireHazardLevel;
    }

    public int getHardness() {
        return hardness;
    }
}
