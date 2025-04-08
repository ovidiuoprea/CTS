package models.factory;

public class BatteryTensionSensor extends AVehicleSensor{

    public static final String BATTERY_TENSION_SENSOR_UNIT = "V";
    BatteryTensionSensor(double sensorValue) {
        super(sensorValue, BATTERY_TENSION_SENSOR_UNIT);
    }

    @Override
    public double readSensorValue() {
        return super.readSensorValue();
    }

    @Override
    public String getUnit() {
        return super.getUnit();
    }
}
