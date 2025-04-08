package models.builder;

public class ElectricCar implements Cloneable {
    private String batteryType;
    private int range;
    private int numberOfEngines;
    private String coolingSystem;
    private boolean supportsFastCharging;
    private boolean hasAutoPilot;
    private boolean hasAdaptiveSuspension;

    ElectricCar(String batteryType, int range, int numberOfEngines, String coolingSystem) {
        this.batteryType = batteryType;
        this.range = range;
        this.numberOfEngines = numberOfEngines;
        this.coolingSystem = coolingSystem;
    }

    void setSupportsFastCharging(boolean supportsFastCharging) {
        this.supportsFastCharging = supportsFastCharging;
    }

    void setHasAutoPilot(boolean hasAutoPilot) {
        this.hasAutoPilot = hasAutoPilot;
    }

    void setHasAdaptiveSuspension(boolean hasAdaptiveSuspension) {
        this.hasAdaptiveSuspension = hasAdaptiveSuspension;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryType='" + batteryType + '\'' +
                ", range=" + range +
                ", numberOfEngines=" + numberOfEngines +
                ", coolingSystem='" + coolingSystem + '\'' +
                ", supportsFastCharging=" + supportsFastCharging +
                ", hasAutoPilot=" + hasAutoPilot +
                ", hasAdaptiveSuspension=" + hasAdaptiveSuspension +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
